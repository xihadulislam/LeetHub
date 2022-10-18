class Solution {
    fun truncateSentence(s: String, k: Int): String {
     return s.split(" ").toTypedArray().toList().subList(0, k).joinToString(" ")
    }
}