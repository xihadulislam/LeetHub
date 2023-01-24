class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n : nums) map.merge(n, 1, Integer::sum);

          for (int n : map.keySet()) {
            if (map.get(n) == 1) return n;
        }

        return -1;
    }
}