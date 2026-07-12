class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1 [] = new int [26];
        int freq2 [] = new int [26];
        int n1= s1.length();
        int n2= s2.length();
        if (n2 < n1) return false;
        int l =0;
        for(int i =0;i<n1;i++){
            freq1[s1.charAt(i)-'a']++;
           
        }
        for(int i =0;i<n1;i++){
            freq2[s2.charAt(i)-'a']++;
           
        }
        
           if (Arrays.equals(freq1, freq2))
            return true;
       int r =0;
            char ch = s2.charAt(r);
        for (int right = n1; right < n2; right++) {

            // Remove left character
            freq2[s2.charAt(right - n1) - 'a']--;

            // Add right character
            freq2[s2.charAt(right) - 'a']++;

            if (Arrays.equals(freq1, freq2))
                return true;
        }

        
return false;

    }
}
