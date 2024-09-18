package problems

class BowlingGame2660(override val problemLink: String) : Problem() {

    private fun go(pins: List<Int>): Int {

        if(pins.size == 1)
            return pins.sum()

        if(pins.size == 2){
            return pins[0] + if(pins[0] == 10) pins[1]*2 else pins[1]
        }

        val points = mutableListOf<Int>()
        points.add(pins[0])
        if(pins[0] == 10)
            points.add(pins[1]*2)
        else
            points.add(pins[1])

        var i = 2
        while(i < pins.size) {
            if(pins[i-1] == 10 || pins[i-2] == 10)
                points.add(pins[i]*2)
            else
                points.add(pins[i])
            i += 1
        }
        return points.sum()
    }

    fun isWinner(player1: IntArray, player2: IntArray): Int {
        val sum1 = go(player1.toList())
        val sum2 = go(player2.toList())

        if(sum1 > sum2)
            return 1
        else if(sum2 > sum1)
            return 2
        else
            return 0
    }

}