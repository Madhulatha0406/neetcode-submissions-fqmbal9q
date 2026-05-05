class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i: stones){
            pq.add(i);
            // if(pq.size()>2){
            //     int y = pq.poll();
            //     int x = pq.poll();
            //     pq.add(y-x);
            // }
        }
        while(pq.size()>=2){
                int y = pq.poll();
                int x = pq.poll();
                pq.add(y-x);
            }
        
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}
