class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        
        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            String num = String.valueOf(i);
            int cnt = 0;
            int temp = i;
            while (temp > 0) {
                int a = temp % 10;
                if (a != 0 && i % a == 0) cnt++;
                temp = (temp - a) / 10;
            }
           // Log.d(TAG, "selfDividingNumbers: " + cnt + " " + num.length());
            if (cnt == num.length()) list.add(i);
        }

        return list;
        
    }
}