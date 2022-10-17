class Solution {
    fun isStrictlyPalindromic(n: Int): Boolean {
        var isThat = true
        var base = 2
        var tem = n;
        while (tem>=2) {
            val result = Math.pow(base.toDouble(), n.toDouble())
            if (!isPalindrome(result.toInt())) {
                return false
            }
            base++
            tem--
        }

        return isThat
    }

   fun isPalindrome(x: Int): Boolean {
      return  x.toString() == x.toString().reversed()
    }
}