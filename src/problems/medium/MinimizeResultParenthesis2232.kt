package problems.medium

import problems.Problem

/**
 * The solution below is a brute force strategy.
 *
 * 1. Break the string into 2 nums by splitting using `+
 * 2. Put ( before every character in num1.
 * 3. Put ) after every character in num2.
 * 4. Calculate result for every such combination.
 * 5. Result combination with minimum results.
 *
 * Corner cases handled in code:
 *
 * 1. ( can't be placed after last character/digit of num1.
 * 2. ) can't be placed before first character/digit of num2.
 */


class MinimizeResultParenthesis2232(override val problemLink: String) : Problem() {

    private fun String.addCharAtIndex(char: Char, index: Int): String {
        return StringBuilder(this).apply { insert(index, char) }.toString()
    }

    private fun findResult(num1: String, num2: String, i: Int, j: Int): Int {
        val first = if(num1.substring(0, i).isNotEmpty()) num1.substring(0, i).toInt() else 1
        val middle = (num1.substring(i, num1.length).toInt() + num2.substring(0, j).toInt())
        val last = if(num2.substring(j, num2.length).isNotEmpty()) num2.substring(j, num2.length).toInt() else 1

        return first * middle * last
    }

    private fun breakExpression(num1: String, num2: String, i: Int, j: Int): String {
        return num1.addCharAtIndex('(', i) + '+' + num2.addCharAtIndex(')', j)
    }

    fun minimizeResult(expression: String): String {
        val num1 = expression.split("+")[0]
        val num2 = expression.split("+")[1]

        var i = 0

        var maxSum = Int.MAX_VALUE
        var brokenExpression = expression

        while(i < num1.length) {
            var j = 1
            while (j <= num2.length) {
                val r = findResult(num1, num2, i, j)
                if(r < maxSum) {
                    maxSum = r
                    brokenExpression = breakExpression(num1, num2, i, j)
                }
                j += 1
            }
            i += 1
        }
        return brokenExpression
    }

}