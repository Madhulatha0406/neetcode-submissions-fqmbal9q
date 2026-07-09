class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i],1)+1);


        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            pq.add(entry);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int i =0;
        int arr[] = new int[k];
        while(pq.size()>0){
           
        arr[i]= pq.poll().getKey();
        i++;
        }
        return arr;
        
    }
}
