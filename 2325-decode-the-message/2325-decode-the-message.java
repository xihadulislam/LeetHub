class Solution {
    public String decodeMessage(String key, String message) {
        
        StringBuilder ans = new StringBuilder();

        Map<Character, Character> map = new TreeMap<>();

        StringBuilder newKey = new StringBuilder();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) != ' ' && newKey.indexOf(String.valueOf(key.charAt(i))) < 0) {
                newKey.append(key.charAt(i));
            }
        }

        char c = 'a';
        for (int t = 0; t < newKey.length(); t++) {
            map.put( newKey.charAt(t),c);
            ++c;
        }

     
        for (int i = 0; i < message.length(); i++) {
            if (message.charAt(i) == ' ') ans.append(message.charAt(i));
            else ans.append(map.get(message.charAt(i)));
        }

        return ans.toString();

    }
}