class Solution {
    public int[] searchRange(int[] nums, int target) {
        int f = -1;
        int s = -1;

        int rev = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (f == -1 && nums[i] == target) f = i;
            if (s == -1 && nums[rev] == target) s = rev;
            rev--;
        }
        int[] a = new int[2];
        a[0] = f;
        a[1] = s;
        return a;
    }
}