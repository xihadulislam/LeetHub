class Solution {
    fun sortSentence(s: String): String {
        val lstValues: List<String> = s.split(" ").map { it.trim() }
        val treeMap: TreeMap<String, String> = TreeMap()

        lstValues.forEach {
            treeMap[it.last().toString()] = it.dropLast(1)
        }

        return treeMap.values.joinToString(" ") 
    }
}