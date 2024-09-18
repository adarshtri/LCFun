package problems.medium

import problems.Problem

class MaxTotalCostAlternatingArray3196(override val problemLink: String) : Problem() {

    // idea: https://www.youtube.com/watch?v=ZzOdbGx3KAs
    // Favorite submission: https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/submissions/1392620264/

    private var excludeMemo: MutableMap<String, Long> = mutableMapOf()
    private var includeMemo: MutableMap<String, Long> = mutableMapOf()
    private var size: Int = 0
    private var nums: IntArray = IntArray(0)

    private fun include(currentIndex: Int, withPositive: Boolean): Long {

        if(currentIndex == size)
            return 0

        if("$currentIndex,$withPositive" in includeMemo)
            return includeMemo["$currentIndex,$withPositive"]!!

        var a: Long
        var b: Long

        if(withPositive) {
            a = nums[currentIndex] + include(currentIndex + 1, false)
            b = nums[currentIndex] + exclude(currentIndex + 1)
        } else {
            a = -nums[currentIndex] + include(currentIndex + 1, true)
            b = nums[currentIndex] + exclude(currentIndex + 1)
        }

        includeMemo["$currentIndex,$withPositive"] =  maxOf(a, b)
        return includeMemo["$currentIndex,$withPositive"]!!
    }

    private fun exclude(currentIndex: Int): Long {
        if(currentIndex == size)
            return 0

        if("$currentIndex" in excludeMemo)
            return excludeMemo["$currentIndex"]!!

        var a = nums[currentIndex] + exclude(currentIndex+1)
        var b = nums[currentIndex] + include(currentIndex+1, false)

        excludeMemo["$currentIndex"] = maxOf(a, b)
        return excludeMemo["$currentIndex"]!!
    }


    fun maximumTotalCost(nums: IntArray): Long {
        this.size = nums.size
        this.nums = nums
        return maxOf(nums[0] + exclude(1), nums[0] + include(1, false))
    }

}