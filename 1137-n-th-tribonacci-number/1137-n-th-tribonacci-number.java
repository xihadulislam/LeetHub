class Solution {
    public int tribonacci(int n) {
        
        if (n <= 1) return n;
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        for (int i = 3; i <= n; i++) {
            int tmp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tmp;
        }
        return t2;
    }
    
        public int ff (int n){
            int[] arr = new int[100000];
        arr[0] = 0;
        arr[1] = 1;
        
        if (n == 0) {
            return arr[0];
        }
      
        
        if (n == 1) {
            return arr[0];
        }
      
        if (n == 2) {
            return arr[1];
        } else {
            arr[n - 1] = ff(n - 1) + ff(n - 2)+ff(n-3);
            
            return (arr[n - 1]+arr[n-2]+arr[n-3]);
        }
    }
}