package problems

import kotlin.math.min

class JumpGameII45(override val problemLink: String) : Problem() {

    fun jump(nums: IntArray): Int {
        return search(nums, 0, IntArray(nums.size))
    }

    private fun search(nums: IntArray, index: Int, dp: IntArray): Int {

        println("Searching from $index to ${nums.size -1} with DP: ${dp.toList()}")

        if (index >= nums.lastIndex) {
            return 0
        }

        if (dp[index] != 0) {
            return dp[index]
        }

        var minCount = 10000

        for (i in 1 .. nums[index]) {
            minCount = minOf(minCount, search(nums, index + i, dp) + 1)
        }

        dp[index] = minCount

        println("Searched from $index to ${nums.size -1} with Mini: ${dp[index]}")

        return dp[index]
    }

}