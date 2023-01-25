class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
      //  Set<Integer> set = new HashSet<>();
      //  for (int n : nums) set.add(n);

       // List<Integer> list = set.stream().collect(Collectors.toList());

        Map<Integer,Integer> mp = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(i-mp.get(nums[i]))<=k) return true;
            }
            mp.put(nums[i],i);
        }
        return false;

    }
}