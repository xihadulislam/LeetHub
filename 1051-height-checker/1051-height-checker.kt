class Solution {
    fun heightChecker(heights: IntArray): Int {
        var cnt =0
        val temp: MutableList<Int> = mutableListOf()
        temp.addAll(heights.toMutableList())
        temp.sort()
        
        temp.forEachIndexed { index, i ->
            if (i!=heights[index]) cnt++
        }
        return  cnt
    }
}