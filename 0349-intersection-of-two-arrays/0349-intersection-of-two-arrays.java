class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();


        for (int t : nums1) ans1.add(t);
        for (int t : nums2) ans2.add(t);
        List<Integer> aa = new ArrayList<>();
        for (int t : ans1){
            if (ans2.contains(t)) aa.add(t);
        }
        
        int [] ans = new int[aa.size()];
        
        for (int i=0;i<aa.size();i++){
            ans[i]=aa.get(i);
        }
        return  ans;
    }
}