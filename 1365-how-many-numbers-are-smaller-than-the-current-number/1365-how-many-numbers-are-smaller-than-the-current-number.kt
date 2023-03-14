class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val ans = IntArray(nums.size)
        nums.forEachIndexed { index, i ->
            var cnt = 0
            
            nums.forEach {
                if (i > it) cnt++
            }
            ans[index] = cnt

        }
        return ans
    }
}