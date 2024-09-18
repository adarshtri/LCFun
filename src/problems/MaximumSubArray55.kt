package problems

import kotlin.math.max

class MaximumSubArray55(override val problemLink: String) : Problem() {

    fun maxSubArray(nums: IntArray): Int {

        var maxSum = nums[0]
        var currentSum = 0

        var i = 0
        while (i < nums.size) {
            currentSum += nums[i]

            if(currentSum < 0){
                if(maxSum < 0)
                    maxSum = maxOf(maxSum, currentSum)
                currentSum = 0
            }
            else
                maxSum = maxOf(maxSum, currentSum)
            i += 1
        }
        return maxSum
    }

}