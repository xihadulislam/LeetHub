class Solution {
    fun sortPeople(names: Array<String>, heights: IntArray): Array<String> {
        
        val treeMap: TreeMap<Int, String> = TreeMap()
        
        names.forEachIndexed { index, s ->
            treeMap[heights[index]] = s
        }
        
        return treeMap.values.reversed().toTypedArray()
    }
}