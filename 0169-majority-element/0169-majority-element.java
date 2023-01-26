class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);

        int max = 0;
        for (int i : map.keySet()) {
            if (map.get(i)>(nums.length/2)) max=i;
        }

     //   System.out.println(map.keySet());
      //  System.out.println(map.values());

        
        return max;
    }
}