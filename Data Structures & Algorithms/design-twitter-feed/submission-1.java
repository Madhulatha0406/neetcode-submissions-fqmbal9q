class Twitter {
    // userId -> set of users they follow
    private Map<Integer, Set<Integer>> following;
    // usetId-> list of tweets
      private Map<Integer, List<Tweet>> tweets;
    private int time;
    // represents single tweet
    private class Tweet {
        int tweetId;
        int time;
        Tweet(int tweetId, int time) {
            this.tweetId = tweetId;
            this.time = time;
        }
    }

    public Twitter() {
        following = new HashMap<>();
        tweets = new HashMap<>();
        time = 0;
    }

    public void postTweet(int userId, int tweetId) {
        tweets.putIfAbsent(userId, new ArrayList<>());
        tweets.get(userId).add(new Tweet(tweetId, time++));

        following.putIfAbsent(userId, new HashSet<>());
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();
        // Max heap based on tweet time
        PriorityQueue<Tweet> maxHeap = new PriorityQueue<>((a, b) -> b.time - a.time);

        // User should see their own tweets
        addTweetsToHeap(userId, maxHeap);
        // Add tweets from people user follows
        if (following.containsKey(userId)) {
            for (int followeeId : following.get(userId)) {
                addTweetsToHeap(followeeId, maxHeap);
            }
        }
        // Take at most 10 most recent tweets
        while (!maxHeap.isEmpty() && result.size() < 10) {
            result.add(maxHeap.poll().tweetId);
        }

        return result;
    }
    private void addTweetsToHeap(int userId, PriorityQueue<Tweet> maxHeap) {
        if (!tweets.containsKey(userId)) {
            return;
        }

        maxHeap.addAll(tweets.get(userId));
    }

    public void follow(int followerId, int followeeId) {
           if (followerId == followeeId) {
        return;
    }

        following.putIfAbsent(followerId, new HashSet<>());

        following.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (following.containsKey(followerId)) {
            following.get(followerId).remove(followeeId);
        }
    }
}
