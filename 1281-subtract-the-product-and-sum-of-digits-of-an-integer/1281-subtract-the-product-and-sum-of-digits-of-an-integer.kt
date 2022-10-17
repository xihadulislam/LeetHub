class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var sum = 0
        var mu = 1
        var tempNum = n
        while (tempNum > 0) {
            val r = tempNum % 10
            sum += r
            mu *= r
            tempNum /= 10
        }
        return mu - sum
    }
}