class Solution {
    public int countPoints(String rings) {
        Map<Integer, Set<Character>> map = new HashMap<>();

        for (int i = 1; i < rings.length(); i += 2) {
            int k = Integer.parseInt(String.valueOf(rings.charAt(i)));
            Set<Character> list = map.get(k);
            if (list != null) {
                list.add(rings.charAt(i - 1));
                map.put(k, list);
            } else {
                Set<Character> li = new HashSet<>();
                li.add(rings.charAt(i - 1));
                map.put(k, li);
            }
        }

        int cnt = 0;

        for (int cr : map.keySet()) {
            if (map.get(cr).size()==3) cnt++;
        }

       // Log.d(TAG, "countPoints: " + map.keySet());
       // Log.d(TAG, "countPoints: " + map.values());

        return cnt;
    }
}