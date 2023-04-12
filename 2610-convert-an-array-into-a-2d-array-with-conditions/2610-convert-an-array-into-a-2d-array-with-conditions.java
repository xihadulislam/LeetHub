class Solution {
       public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        while (nums.length != 0) {
            List<Integer> list = new ArrayList<>();
            boolean flg = true;
            for (int i = 0; i < nums.length; i++) {
                if (isNotExit(nums[i], list) && nums[i] != -1) {
                    list.add(nums[i]);
                    nums[i] = -1;
                }
                if (nums[i] != -1) flg = false;
            }
          
            if (flg&& list.isEmpty()) return  ans;
            ans.add(list);
        }

        return ans;
    }

    boolean isNotExit(int num, List<Integer> list) {
        for (int n : list) if (num == n) return false;

        return true;
    }


    
}