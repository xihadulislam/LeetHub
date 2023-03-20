class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        String[] ans = new String[score.length];
        Map<Integer, Integer> map = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < score.length; i++) {
            map.put(score[i], i);
        }

        int cnt = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
         
            if (cnt == 0) ans[entry.getValue()] = "Gold Medal";
            else if (cnt == 1) ans[entry.getValue()] = "Silver Medal";
            else if (cnt == 2) ans[entry.getValue()] = "Bronze Medal";
            else ans[entry.getValue()] = "" + (cnt+1);
            cnt++;
        }
        
        return ans;
    }
}