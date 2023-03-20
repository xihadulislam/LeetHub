class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;

            for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i; j++) {
                  if (  Math.abs(nums[i] - nums[j]) == k) cnt++;
              //  System.out.println(nums[j]+"  --j");
            }

           // System.out.println(nums[i]+"  i");
        }


        return cnt;
    }
}