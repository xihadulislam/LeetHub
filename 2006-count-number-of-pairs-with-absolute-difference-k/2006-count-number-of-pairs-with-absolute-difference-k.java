class Solution {
    public int countKDifference(int[] nums, int k) {
        int cnt = 0;

            for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j <=i; j++) {
                int sum = nums[i] - nums[j];
                    if(sum<0) sum*=-1;
                  if (  sum == k) cnt++;
              //  System.out.println(nums[j]+"  --j");
            }

           // System.out.println(nums[i]+"  i");
        }


        return cnt;
    }
}