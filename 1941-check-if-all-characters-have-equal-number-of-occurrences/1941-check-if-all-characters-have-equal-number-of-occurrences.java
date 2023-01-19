class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.merge(s.charAt(i), 1, Integer::sum);
        }
        
        Set<Integer> li = new HashSet<>();
        for (char cr : map.keySet()) {
            li.add(map.get(cr));
        }
        
        return li.size() == 1;
    }
}