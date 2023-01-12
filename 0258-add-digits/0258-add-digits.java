class Solution {
    public int addDigits(int num) {
        int ans = num;
        
        while (String.valueOf(ans).length() > 1) {
            int temAns = 0;
            int temp = ans;
            while (temp > 0) {
                int a = temp % 10;
                temAns += a;
                temp = (temp - a) / 10;
            }
            ans = temAns;
        }
        return ans;
    }
}