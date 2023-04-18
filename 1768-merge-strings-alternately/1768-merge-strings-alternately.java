class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder sb = new StringBuilder();
        
        int wl = word1.length();
        
        int w2l = word2.length();

        for (int i = 0; i < (Math.max(wl, w2l)); i++) {
            
            if (i<wl) sb.append(word1.charAt(i));
            
            if (i<w2l) sb.append(word2.charAt(i));
        }

        return sb.toString();
    }
}