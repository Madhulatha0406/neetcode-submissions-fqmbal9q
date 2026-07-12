class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int l =0;
        int maxlen=0;
        int n = s.length();
        for(int r =0;r<n;r++){
            char ch = s.charAt(r);
            while(set.contains(ch)){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(ch);
          //  r++;
            maxlen = Math.max(maxlen,r-l+1);


        }
        return maxlen;
    }
}
