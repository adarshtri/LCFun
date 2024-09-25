package problems.hard

import problems.Problem
import kotlin.math.pow

/**
 * Solution: DP
 * Problem Link: https://leetcode.com/problems/dice-roll-simulation/description/
 *
 * Beats 100% time and memory.
 */

class DiceRollSimulation1223(override val problemLink: String) : Problem() {

    private val memo: MutableMap<String, Double> = mutableMapOf()
    private var n = 0
    private var rollMax: IntArray = listOf<Int>().toIntArray()

    private fun Double.mod(): Int {
        return (this % (10.0.pow(9) + 7)).toInt()
    }

    private fun go(nNow: Int, lastRoll: Int, repetitionCount: Int): Double {

        if(nNow >= this.n)
            return 1.0

        val memoKey = "$nNow,$lastRoll,$repetitionCount"

        if(memoKey in memo)
            return memo[memoKey]!!

        var answer = 0.0

        (1..6).forEach {
            if(it == lastRoll) {
                if (repetitionCount < rollMax[it-1])
                    answer += go(nNow + 1, it, repetitionCount + 1).mod()
            }
            else if(rollMax[it-1] > 0)
                answer += go(nNow + 1, it, 1).mod()
        }

        memo[memoKey] = answer
        return memo[memoKey]!!
    }

    fun dieSimulator(n: Int, rollMax: IntArray): Int {

        this.n = n
        this.rollMax = rollMax

        return go(0, 0, 0).mod()
    }
}