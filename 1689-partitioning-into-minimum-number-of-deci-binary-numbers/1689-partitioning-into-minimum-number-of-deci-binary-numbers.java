class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        
         for (int i = 0; i < n.length(); i++) {
             int temp = n.charAt(i)-'0';
            if (temp > ans) ans = temp;
        }

        return ans; 
    }
}