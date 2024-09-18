package problems

class ArrayGameWinner1535(override val problemLink: String) : Problem() {

    private fun simulateGameStep(queue: ArrayDeque<Int>): Int {
        val winnerIndex = if(queue[0] > queue[1]) 0 else 1
        val loserIndex = if(winnerIndex == 0) 1 else 0
        val winner = queue[winnerIndex]

        val toBeRemoved = queue.removeAt(loserIndex)
        queue.addLast(toBeRemoved)

        return winner
    }

    fun getWinner(arr: IntArray, k: Int): Int {

        if(arr.size == 1)
            return arr[0]
        else if(arr.size == 2)
            return maxOf(arr[0], arr[1])
        else if(k >= arr.size)
            return arr.max()
        else {
            val arrAsQueue = ArrayDeque(arr.toList())

            var lastWinner = simulateGameStep(arrAsQueue)
            var lastWinnerCount = 1

            while(lastWinnerCount != k) {
                val nextWinner = simulateGameStep(arrAsQueue)
                if(nextWinner == lastWinner) {
                    lastWinnerCount += 1
                } else {
                    lastWinner = nextWinner
                    lastWinnerCount = 1
                }
            }
            return lastWinner
        }
    }

}