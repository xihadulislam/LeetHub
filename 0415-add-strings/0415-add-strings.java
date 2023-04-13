import java.math.BigInteger;
class Solution {
    public String addStrings(String num1, String num2) {
        
        BigInteger big = new BigInteger(num1);
        
        BigInteger big2 = new BigInteger(num2);
       
        return big.add(big2).toString();
        
    }
}