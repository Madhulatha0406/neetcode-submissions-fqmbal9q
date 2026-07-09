class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
         
         String x;
        for(int i =0;i<strs.length;i++){
           
           // if(map.containsKey(s))
           
           x= strs[i];
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
           
            if(map.containsKey(s)){
               
              List<String> temp= map.get(s);
              temp.add(x);
            } else{
                List<String> list = new ArrayList<>();
                 list.add(x);
                map.put(s,list );

            }
           



        }
        return new ArrayList<>(map.values());
    }
}
