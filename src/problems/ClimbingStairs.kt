package problems

class ClimbingStairs(override val problemLink: String) : Problem() {

    private var memo = mutableMapOf<Int, Int> ()

    private fun takeStep(remaining: Int): Int {

        if(remaining in memo)
            return memo[remaining]!!

        if(remaining == 0)
            return 1

        if(remaining < 0)
            return 0

        var uniquePath = 0

        if(remaining > 1)
            uniquePath += takeStep(remaining-2)

        uniquePath += takeStep(remaining-1)
        memo[remaining] = uniquePath
        return memo[remaining]!!
    }

    fun climbStairs(n: Int): Int {

        return takeStep(n)
    }

}