class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        int j = 0;
        
       while (i < nums.length) {

           // if (nums[j] == 0) j++;
             if (nums[i] != 0) {
                int tem = nums[i];
                nums[i] = nums[j];
                nums[j] = tem;
                j++;
            }

            i++;

        }


    }
}