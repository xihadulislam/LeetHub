class Solution {
    fun numberOfMatches(n: Int): Int {
        var ans = 0
        var tem = n
        while (tem > 1) {
            var r = 0
            if (tem % 2 == 0) {
                r = tem / 2
            } else {
                r = (tem - 1) / 2
            }
            ans += r
            tem -= r
        }

        return ans
    }
}