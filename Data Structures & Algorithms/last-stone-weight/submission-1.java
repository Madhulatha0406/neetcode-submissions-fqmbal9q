class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i =0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        while(pq.size()>1){
            int x = pq.poll();
            int y = pq.poll();
            if(y==x) continue;
            else pq.offer(x-y);

        }
        if(pq.size()==0) return 0;
        else return pq.poll();
        
        
    }
}
