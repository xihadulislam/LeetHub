class Solution {
    public int countDigits(int num) {
        int cnt = 0;
        int temp = num;
        while (temp > 0) {
            int a = temp % 10;
            if (a != 0 && num % a == 0) cnt++;
            temp = (temp - a) / 10;
        }
        return cnt;
    }
}