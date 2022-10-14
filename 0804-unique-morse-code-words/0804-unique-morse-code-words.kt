class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
                val mos = arrayOf(
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
        )

        val treeMap: TreeMap<Char, String> = TreeMap()
        var c = 'a'
        var i = 0;
        while (c <= 'z') {
            treeMap[c] = mos[i]
            ++c
            i++
        }

        val ans: MutableSet<String> = mutableSetOf()

        words.forEach {
            val srt = StringBuilder()
            it.forEach { car ->
                srt.append(treeMap.get(car))
            }
            ans.add(srt.toString())
        }
        
        return ans.size
    }
}