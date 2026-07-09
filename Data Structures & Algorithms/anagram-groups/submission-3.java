//optimal soln tc = o(m*n)


class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String word : strs) {

            int[] freq = new int[26];

            for (char ch : word.toCharArray()) {
                freq[ch - 'a']++;
            }

            StringBuilder key = new StringBuilder();

            for (int count : freq) {
                key.append(count).append("#");
            }

            String signature = key.toString();

            if (!map.containsKey(signature)) {
                map.put(signature, new ArrayList<>());
            }

            map.get(signature).add(word);
        }

        return new ArrayList<>(map.values());
    }
}