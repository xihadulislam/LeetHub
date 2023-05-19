class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0,j=0;
        
        if (s.length() == 0 && t.length() == 0 ) return true;
        if (s.length() == 0 && t.length() >= 1 ) return true;
        if (s.length() == 1 && t.length() == 1 && !s.equals(t)) return false;
        
        while (j < t.length()  ) {

            if (s.charAt(i) == t.charAt(j)) i++;

            if (i == s.length() ) return true;
            
          //  System.out.println(i+" "+(s.length() ));

            j++;
        }

        return false;
    }
}