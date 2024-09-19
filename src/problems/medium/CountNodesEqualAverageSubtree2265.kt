package problems.medium

import problems.Problem
import problems.types.TreeNode

data class NodeResult (
    val branchSum: Int,
    val branchNodes: Int,
    val satisfyCondition: Int
)

class CountNodesEqualAverageSubtree2265(override val problemLink: String) : Problem() {

    private fun go(root: TreeNode?): NodeResult? {
        if(root == null){
            return null
        }

        if(root.right == null && root.left == null)
            return NodeResult(
                branchSum = root.`val`,
                branchNodes = 1,
                satisfyCondition = 1
            )

        var left = go(root.left)
        var right = go(root.right)

        var subTreeSum = root.`val` + (right?.branchSum ?: 0) + (left?.branchSum ?: 0)
        var subTreeNodeCount = 1 + (right?.branchNodes ?: 0) + (left?.branchNodes ?: 0)

        val result = NodeResult(
            branchSum = subTreeSum,
            branchNodes = subTreeNodeCount,
            satisfyCondition = (if(subTreeSum / subTreeNodeCount == root.`val`) 1 else 0) + (right?.satisfyCondition ?: 0) + (left?.satisfyCondition ?: 0)
        )

        return result
    }

    fun averageOfSubtree(root: TreeNode?): Int {
        return go(root)?.satisfyCondition ?: 0
    }

}