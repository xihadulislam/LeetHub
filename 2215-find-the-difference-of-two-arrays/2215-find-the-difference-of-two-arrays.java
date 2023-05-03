import java.util.Iterator;
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        List<List<Integer>> ans = new ArrayList<>();
        Set<Integer> ans1 = new HashSet<>();
        Set<Integer> ans2 = new HashSet<>();


        for (int t : nums1) ans1.add(t);
        for (int t : nums2) ans2.add(t);

        List<Integer> aa = new ArrayList<>();
        List<Integer> bb = new ArrayList<>();
        
        for (int t : ans1){
            if (!ans2.contains(t)) aa.add(t);
        }

        for (int t : ans2){
            if (!ans1.contains(t)) bb.add(t);
        }


        ans.add(aa);
        ans.add(bb);

        return ans;
        
        
    }
}