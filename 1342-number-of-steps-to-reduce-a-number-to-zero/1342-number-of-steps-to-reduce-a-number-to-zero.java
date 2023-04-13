class Solution {
    public int numberOfSteps(int num) {
        
        int cnt =0;
        
        int obt = num;
        
        while(obt>0){
            
            if(obt%2==0) {
                obt= obt/2;
                    cnt++;
            }else{
                obt--;
                    cnt++;
            }
        }
        
        return cnt;
    }
}