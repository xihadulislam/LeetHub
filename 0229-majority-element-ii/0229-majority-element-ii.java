class Solution {
    public List<Integer> majorityElement(int[] nums) {
       Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);

        List<Integer> max = new ArrayList<>();
        for (int i : map.keySet()) {
            if (map.get(i) > (nums.length / 3)) max.add(i);
        }

        //   System.out.println(map.keySet());
        //  System.out.println(map.values());
        
        return max;
    }
}