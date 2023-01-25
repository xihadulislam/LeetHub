class Solution {
    public List<String> stringMatching(String[] words) {
       Set<String> ans = new HashSet<>();

        for (String w : words) {
            for (String ne : words) {
                if (!w.equals(ne) && ne.contains(w)) ans.add(w);
            }
        }

        return new ArrayList<>(ans);
    }
}