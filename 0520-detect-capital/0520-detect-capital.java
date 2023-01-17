class Solution {
    public boolean detectCapitalUse(String word) {
      int cntUp = 0;
        int cntDown = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') cntUp++;
            if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') cntDown++;
        }

        if (cntUp == word.length()) return true;
        if (cntDown == word.length()) return true;

     //   Log.d(TAG, "detectCapitalUse: " + cntUp + "  " + cntDown);

        return word.charAt(0) >= 'A' && word.charAt(0) <= 'Z' && cntUp == 1 && cntDown >= cntUp;
        
    }
}