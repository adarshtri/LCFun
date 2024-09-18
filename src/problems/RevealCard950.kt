package problems

class RevealCard950(override val problemLink: String) : Problem() {

    fun deckRevealedIncreasing(deck: IntArray): IntArray {
        val rDeck = MutableList(deck.size) { -1 }
        var positionQueue = ArrayDeque<Int>((0..<deck.size).map { it })
        var sDeck = deck.sorted()

        var count = 0
        var skip = false
        while(count < deck.size) {
            if(skip){
                skip = false
                positionQueue.addLast(positionQueue.removeFirst())
            }else{
                skip = true
                val index = positionQueue.removeFirst()
                rDeck[index] = sDeck[count]
                count += 1
            }
        }
        return rDeck.toIntArray()
    }

}