import problems.*

val problemsMap = mapOf(
    DeleteNode3217::class.simpleName to DeleteNode3217("https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/description/"),
    RevealCard950::class.simpleName to RevealCard950("https://leetcode.com/problems/reveal-cards-in-increasing-order/"),
    ArrayGameWinner1535::class.simpleName to ArrayGameWinner1535("https://leetcode.com/problems/find-the-winner-of-an-array-game/"),
    LongestSubsequenceWithLimitedSum2389::class.simpleName to LongestSubsequenceWithLimitedSum2389("https://leetcode.com/problems/longest-subsequence-with-limited-sum/"),
    DeleteMiddleNode2095::class.simpleName to DeleteMiddleNode2095("https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/"),
    JumpGameII45::class.simpleName to JumpGameII45("https://leetcode.com/problems/jump-game-ii/"),
    MaximumSubArray55::class.simpleName to MaximumSubArray55("https://leetcode.com/problems/maximum-subarray/description/"),
    ClimbingStairs::class.simpleName to ClimbingStairs("https://leetcode.com/problems/climbing-stairs/description/"),
    PathSum112::class.simpleName to PathSum112("https://leetcode.com/problems/path-sum/"),
    Find3DigitEvenNumber2095::class.simpleName to Find3DigitEvenNumber2095("https://leetcode.com/problems/finding-3-digit-even-numbers/"),
    BowlingGame2660::class.simpleName to BowlingGame2660("https://leetcode.com/problems/determine-the-winner-of-a-bowling-game/description/"),
    MaxTotalCostAlternatingArray3196::class.simpleName to MaxTotalCostAlternatingArray3196("https://leetcode.com/problems/maximize-total-cost-of-alternating-subarrays/"),
    MysticDungeonMaximumEnergy3147::class.simpleName to MysticDungeonMaximumEnergy3147("https://leetcode.com/problems/taking-maximum-energy-from-the-mystic-dungeon/"),
    MinimumArrayEnd3133::class.simpleName to MinimumArrayEnd3133("https://leetcode.com/problems/minimum-array-end/"),
    MinimizeResultParenthesis2232::class.simpleName to MinimizeResultParenthesis2232("https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/description/")

)

fun main() {
    val o = problemsMap[MinimizeResultParenthesis2232::class.simpleName]!! as MinimizeResultParenthesis2232
    println(o.minimizeResult("247+38"))
}