class Solution {
    public String replaceDigits(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Integer, Character> map2 = new HashMap<>();

        int cnt = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            map.put(i, cnt);
            map2.put(cnt, i);
            cnt++;
        }

        StringBuilder ans = new StringBuilder();

        if (s.length() > 0 && Character.isDigit(s.charAt(0))) {
            ans.append(map2.get(Integer.parseInt(String.valueOf(s.charAt(0)))));
        } else {
            ans.append(s.charAt(0));
        }

        for (int i = 1; i < s.length(); i++) {

            if (Character.isDigit(s.charAt(i))) {

                char perv = s.charAt(i - 1);
                int last = map.get(perv);
                int current = Integer.parseInt(String.valueOf(s.charAt(i)));
               // Log.d(TAG, "replaceDigits: " + last + " " + current);
                ans.append(map2.get(last + current));
            } else {
                ans.append(s.charAt(i));
            }
        }

//        Input:"v0g6s4d"
//        Output:"vbgdsfd"
//        Expected:"vvgmswd"

        return ans.toString();
    }
}