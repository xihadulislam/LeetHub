class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        List<Integer> ans = new ArrayList<>();
        List<Integer> start = new ArrayList<>();
        List<Integer> mid = new ArrayList<>();
        List<Integer> end = new ArrayList<>();

        for (int num : nums) {
            if (num < pivot) start.add(num);
            if (num == pivot) mid.add(num);
            if (num > pivot) end.add(num);
        }
        ans.addAll(start);
        ans.addAll(mid);
        ans.addAll(end);
        
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}