import java.util.Locale;

class Solution {
    public String capitalizeTitle(String title) {
        String[] ar = title.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String sr : ar) {
            if ( sr.length() > 2)
                sb.append(" ").append(sr.substring(0, 1).toUpperCase(Locale.ROOT)).append(sr.substring(1).toLowerCase(Locale.ROOT));
            else  sb.append(" ").append(sr.toLowerCase(Locale.ROOT));
        }
        return sb.toString().trim();
    }
}