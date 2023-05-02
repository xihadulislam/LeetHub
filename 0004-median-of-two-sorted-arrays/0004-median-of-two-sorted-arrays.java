class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         double ans = 0;
        List<Integer> ar = new ArrayList<>();
        for (int j : nums1) ar.add(j);
        for (int j : nums2) ar.add(j);
        Collections.sort(ar);

       // for (int t : ar) System.out.println(t);
        
       // System.out.println(ar.get((ar.size() / 2)));

        if (ar.size() % 2 == 0) ans = (ar.get((ar.size() / 2) ) +ar.get((ar.size() / 2) - 1))/2.0;
        else ans = ar.get((ar.size() / 2));


        return ans;
    }
}