package problems.easy

import problems.Problem

class LongestSubsequenceWithLimitedSum2389(override val problemLink: String) : Problem() {

    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        val sNums = nums.sorted()

        val sTillNow = MutableList(nums.size) { 0 }

        sNums.forEachIndexed { index, i ->
            if(index == 0)
                sTillNow[index] = i
            else
                sTillNow[index] = sTillNow[index - 1] + i
        }

        return queries.map { query ->
            var i = sTillNow.size - 1
            var subSize = 0
            while(i >= 0 && sTillNow[i] > query) {
                i -= 1
            }
            subSize = i+1
            subSize
        }.toIntArray()

    }

}