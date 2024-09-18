package problems

class MysticDungeonMaximumEnergy3147(override val problemLink: String) : Problem() {

    fun maximumEnergy(energy: IntArray, k: Int): Int {
        var energySum = energy.toMutableList()
        var i = energySum.size - k - 1
        while(i >= 0) {
            energySum[i] += energySum[i+k]
            i-= 1
        }
        return energySum.max()
    }

}