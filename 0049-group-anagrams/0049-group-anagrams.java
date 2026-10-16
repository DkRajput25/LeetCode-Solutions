class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> h = new HashMap<>();
        
        int[] count = new int[26];
        for (String s: strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = new String(c);
            h.putIfAbsent(key, new ArrayList<>());
            h.get(key).add(s);
            
        }
        
        return new ArrayList<>(h.values());
    }
}