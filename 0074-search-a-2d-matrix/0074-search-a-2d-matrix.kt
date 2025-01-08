class Solution {
       fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        for (i in matrix) {
            for (j in i) {
                if (target == j) return true
            }
        }
        return false
    }
}