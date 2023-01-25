class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);


        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {

            if (i > 0 && map.get(s.charAt(i - 1)) < map.get(s.charAt(i))) {
                ans += (map.get(s.charAt(i)) - map.get(s.charAt(i - 1)));
                i--;
            } else {
                ans += map.get(s.charAt(i));
            }
          //  Log.d(TAG, "romanToInt: " + ans + " "+s.charAt(i));
        }

        return ans;
    }
}