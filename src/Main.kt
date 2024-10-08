import problems.easy.*
import problems.hard.DiceRollSimulation1223
import problems.medium.*
import problems.types.TreeNode
import problems.medium.CountNodesEqualAverageSubtree2265
import problems.unsolved.MinimumArrayEnd3133

val problemsMap = mapOf(
    DeleteNode3217::class.simpleName to DeleteNode3217("https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/"),
    RevealCard950::class.simpleName to RevealCard950("https://leetcode.com/problems/reveal-cards-in-increasing-order/"),
    ArrayGameWinner1535::class.simpleName to ArrayGameWinner1535("https://leetcode.com/problems/find-the-winner-of-an-array-game/"),
    LongestSubsequenceWithLimitedSum2389::class.simpleName to LongestSubsequenceWithLimitedSum2389("https://leetcode.com/problems/longest-subsequence-with-limited-sum/"),
    DeleteMiddleNode2095::class.simpleName to DeleteMiddleNode2095("https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/"),
    JumpGameII45::class.simpleName to JumpGameII45("https://leetcode.com/problems/jump-game-ii/"),
    MaximumSubArray53::class.simpleName to MaximumSubArray53("https://leetcode.com/problems/maximum-subarray/description/"),
    ClimbingStairs70::class.simpleName to ClimbingStairs70("https://leetcode.com/problems/climbing-stairs/description/"),
    PathSum112::class.simpleName to PathSum112("https://leetcode.com/problems/path-sum/"),
    Find3DigitEvenNumber2094::class.simpleName to Find3DigitEvenNumber2094("https://leetcode.com/problems/finding-3-digit-even-numbers/"),
    BowlingGame2660::class.simpleName to BowlingGame2660("https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/"),
    MaxTotalCostAlternatingArray3196::class.simpleName to MaxTotalCostAlternatingArray3196("https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/"),
    MysticDungeonMaximumEnergy3147::class.simpleName to MysticDungeonMaximumEnergy3147("https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/"),
    MinimumArrayEnd3133::class.simpleName to MinimumArrayEnd3133("https://leetcode.com/problems/minimum-array-end/"),
    MinimizeResultParenthesis2232::class.simpleName to MinimizeResultParenthesis2232("https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/description/"),
    MinimumOperationsToConvertTime2224::class.simpleName to MinimumOperationsToConvertTime2224("https://leetcode.com/problems/minimum-number-of-operations-to-convert-time/"),
    CountNodesEqualAverageSubtree2265::class.simpleName to CountNodesEqualAverageSubtree2265("https://leetcode.com/problems/count-nodes-equal-to-average-of-subtree/"),
    DiceRollSimulation1223::class.simpleName to DiceRollSimulation1223("https://leetcode.com/problems/dice-roll-simulation/description/")
)

fun main() {
    val o = problemsMap[DiceRollSimulation1223::class.simpleName]!! as DiceRollSimulation1223
    println(o.dieSimulator(30, listOf(2,3,1,2,1,2).toIntArray()))
}