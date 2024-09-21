package problems.hard

import problems.Problem
import kotlin.properties.Delegates

/**
 * Solution: Use Problem hint.
 * Problem: https://leetcode.com/problems/cherry-pickup-ii/description/
 */

class CherryPickII1463(override val problemLink: String) : Problem() {

    private lateinit var dpGrid: MutableList<MutableList<MutableList<Int>>>
    private lateinit var grid: Array<IntArray>
    private var maxCols by Delegates.notNull<Int>()
    private var minCols by Delegates.notNull<Int>()
    private var maxRows by Delegates.notNull<Int>()


    private fun go(i: Int, j: Int, k: Int): Int {

        if(j < 0 || k < 0 || j >= maxCols || k >= maxCols)
            return 0

        if( i == maxRows)
            return 0

        if(dpGrid[i][j][k] != -1)
            return dpGrid[i][j][k]


        var ans = if(j != k) (grid[i][j] + grid[i][k]) else grid[i][j]
        var maxNextRow = 0

        var x = j -1

        while(x <= j+1) {
            var y = k - 1
            while(y <= k+1) {
                maxNextRow = maxOf(maxNextRow, go(i+1, x, y))
                y += 1
            }
            x += 1
        }

        ans += maxNextRow
        dpGrid[i][j][k] = ans
        return dpGrid[i][j][k]
    }

    fun cherryPickup(grid: Array<IntArray>): Int {
        this.maxRows = grid.size
        this.maxCols = grid[0].size
        this.minCols = 0
        this.grid = grid

        this.dpGrid = MutableList(maxRows) {
            MutableList(maxCols) {
                MutableList(maxCols) {
                    -1
                }
            }
        }

        return go(0, 0, this.maxCols-1)
    }
}