class Solution {
    public boolean isAnagram(String s, String t) {
        
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for (int i = 0; i < t.length(); i++) {
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }

         for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);

        }

        for (char cr : sMap.keySet()) {
            if (sMap.get(cr) == null || !Objects.equals(sMap.get(cr), tMap.get(cr))) return false;
        }
        for (char cr : tMap.keySet()) {
            if (tMap.get(cr) == null || !Objects.equals(sMap.get(cr), tMap.get(cr))) return false;
        }

        return true;
    }
}