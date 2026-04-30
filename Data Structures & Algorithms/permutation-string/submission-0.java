class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) return false;

        // build map for s1
        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        // check every substring of size s1.length()
        for (int i = 0; i <= s2.length() - s1.length(); i++) {

            HashMap<Character, Integer> map2 = new HashMap<>();

            // build map for current window
            for (int j = i; j < i + s1.length(); j++) {
                char c = s2.charAt(j);
                map2.put(c, map2.getOrDefault(c, 0) + 1);
            }

            // compare maps
            if (map1.equals(map2)) {
                return true;
            }
        }

        return false;
    }
}