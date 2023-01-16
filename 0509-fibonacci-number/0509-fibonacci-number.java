class Solution {
    public int fib(int n) {
        
        if (n == 0) {
            return 0;
        }
          if (n == 1) {
            return 1;
        }
    
    return ff(n);
    }
    
    public int ff (int n){
            int[] arr = new int[1000];
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
            arr[n - 1] = ff(n - 1) + ff(n - 2);
            return (arr[n - 1]+arr[n-2]);
        }
    }
}