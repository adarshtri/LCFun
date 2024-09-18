package problems.easy

import problems.Problem

class Find3DigitEvenNumber2094(override val problemLink: String) : Problem() {

    private var numbers: MutableList<Int> = mutableListOf()

    private fun matchRequirement(number: String): Boolean {
        if(number[0] == '0')
            return false
        return number.toInt() % 2 == 0
    }

    private fun go(dMap: MutableMap<Int, Int>, currentNumber: String = "") {

        if(currentNumber.length > 3)
            return

        if(currentNumber.length == 3 && matchRequirement(currentNumber))
            numbers.add(currentNumber.toInt())

        dMap.forEach { (t, u) ->

            val dMapCopy = dMap.toMutableMap()

            dMapCopy[t] = dMapCopy[t]!! - 1

            if(dMapCopy[t] == 0)
                dMapCopy.remove(t)

            go(dMapCopy, currentNumber + t.toString())

        }
    }

    fun findEvenNumbers(digits: IntArray): IntArray {
        val l = digits.groupBy { it }.mapValues { it.value.size }.toMutableMap()
        go(l)
        return numbers.sorted().toIntArray()
    }

}