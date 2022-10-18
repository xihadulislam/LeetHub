class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val map: MutableMap<Char, Int> = mutableMapOf()
        sentence.forEach {
            map[it] = 0
        }

        return map.keys.size==26
    }
}