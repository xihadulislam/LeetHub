class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        
          return bubbleSort(score, k);
        
    }
    
        int[][] bubbleSort(int[][] score, int k) {

        for (int i = 0; i < score.length - 1; i++) {
            
            for (int j = 0; j < score.length - i - 1; j++) {
                if (score[j][k] < score[j + 1][k]) {
                    int[] temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
                
              //  System.out.println(score[j][k] + " --  " + score[j+1][k]);

            }
            
        }


        return score;
    }

    
}