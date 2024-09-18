package problems.easy

import problems.Problem

/**
 * Convert 2 times to minutes. Calculate difference between 2 minutes, that will give difference between 2 times in minutes.
 *
 * After than, use something similar to prime factorization to figure out how many times we need to change time.
 */

class MinimumOperationsToConvertTime2224(override val problemLink: String) : Problem() {

    private fun toMinutes(time: String): Int {
        return time.split(":")[0].toInt() * 60 + time.split(":")[1].toInt()
    }

    fun convertTime(current: String, correct: String): Int {
        val currentMinute = toMinutes(current)
        val correctMinute = toMinutes(correct)
        var diff = correctMinute - currentMinute

        val increments = listOf(60, 15, 5, 1)

        var times = 0

        increments.forEach {
            times += diff / it
            diff %= it
        }

        return times
    }
}