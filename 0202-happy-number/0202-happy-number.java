class Solution {
    public boolean isHappy(int n) {
        List<Integer> temList = new ArrayList<>();

        if (n == 1) return true;
        int ans = n;
        while (ans > 1) {

            String ar = String.valueOf(ans);

            int tem = 0;
            for (int i = 0; i < ar.length(); i++) {
                int i1 = Integer.parseInt(String.valueOf(ar.charAt(i)));
                tem += i1 * i1;
            }
            ans = tem;
            if (!temList.contains(tem))
                temList.add(ans);
            else {
                return false;
            }

          // Log.d(TAG, "isHappy: " + ans);
            // return  false;
        }

        return ans == 1;

    }
}