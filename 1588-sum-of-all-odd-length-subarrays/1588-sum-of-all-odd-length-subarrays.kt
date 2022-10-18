class Solution {
    fun sumOddLengthSubarrays(arr: IntArray): Int {
       var ans = 0
          for(index in 1.. arr.size step 2){
                val list = arr.toList().windowed(index)
                list.forEach {
                    it.forEach {v->
                        ans+=v
                    }
                }
        }
        return ans
    }
}