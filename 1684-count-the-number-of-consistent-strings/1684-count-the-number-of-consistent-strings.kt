class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var ans = 0
        words.forEach {
            var flg = true
            it.forEach { c ->
                if (!allowed.contains(c.toString())) flg = false
            }
            if (flg) ans++
        }

        return ans
    }
}