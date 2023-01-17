class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        Map<Character, Integer> def = new HashMap<>();
        int cnt = 0;
        for (char i = 'a'; i <= 'z'; i++) {
            def.put(i, cnt);
            cnt++;
        }

        String f = "";

        for (int i = 0; i < firstWord.length(); i++) {
            f += def.get(firstWord.charAt(i));
        }

        int first = Integer.parseInt(f);
        f = "";
        for (int i = 0; i < secondWord.length(); i++) {
            f += def.get(secondWord.charAt(i));
        }

        int second = Integer.parseInt(f);

        f = "";
        for (int i = 0; i < targetWord.length(); i++) {
            f += def.get(targetWord.charAt(i));
        }

        int target = Integer.parseInt(f);


        return first + second == target;
    }
}