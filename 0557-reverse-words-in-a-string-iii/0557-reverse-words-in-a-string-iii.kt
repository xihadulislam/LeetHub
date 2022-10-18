class Solution {
    fun reverseWords(s: String): String {
            val list: List<String> = s.split(" ").toTypedArray().toList()
        val sb = StringBuilder()
        list.forEach {
            sb.append(it.reversed()+" ")
        }
        return sb.toString().trim()
    }
}