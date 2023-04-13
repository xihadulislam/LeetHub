import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        
          StringBuilder sum = new StringBuilder();
        
        for(int i=0;i<num.length;i++){
               sum.append(num[i]+"");
        }
        
        BigInteger big = new BigInteger(sum.toString());
        
         String str = big.add( new BigInteger(k+"")).toString();
        
        for(int i=0;i<str.length();i++){
            ans.add(Integer.valueOf(str.charAt(i)+""));
        }
        
        
        return ans;
    }
}