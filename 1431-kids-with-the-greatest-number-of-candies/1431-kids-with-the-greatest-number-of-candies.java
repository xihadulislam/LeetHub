class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        
        List<Boolean> ans = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            
            int current = candies[i]+extraCandies;
            
            boolean flg = true;
            
            for(int j=0;j<candies.length;j++){
    
            if(current< candies[j]) flg= false;
        }
            
          ans.add(flg);
      
            
        }
        
        return ans;
        
    }
}