package problems.easy

import problems.Problem

/**
 * Solution: Followed hint.
 * Question: https://leetcode.com/problems/intersection-of-multiple-arrays/description/
 */

class IntersectionOfMultipleArrays2248(override val problemLink: String) : Problem() {

    fun intersection(nums: Array<IntArray>): List<Int> {

        val cMap = mutableMapOf<Int, Int>()
        val totalArrays = nums.size
        val answer = mutableListOf<Int>()

        nums.forEach { innerArray: IntArray ->
            innerArray.forEach { ele ->
                if(!cMap.contains(ele))
                    cMap[ele] = 0
                cMap[ele] = cMap[ele]!! + 1

                if(cMap[ele] == totalArrays)
                    answer.add(ele)
            }
        }
        return answer.toList().sorted()
    }

}