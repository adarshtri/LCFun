package problems

import problems.types.TreeNode
import kotlin.properties.Delegates

class PathSum112(override val problemLink: String) : Problem() {

    private var targetSum by Delegates.notNull<Int>()

    private fun go(root: TreeNode, runningSum: Int): Boolean {
        if(root.left == null && root.right == null) {
            return runningSum + root.`val` == this.targetSum
        }

        val left = root.left
        val right = root.right

        val l = if(left != null) go(left, runningSum + root.`val`) else false

        if(l)
            return l

        return if(right != null) go(right, runningSum + root.`val`) else false
    }

    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        this.targetSum = targetSum
        if(root == null)
            return false

        return go(root, 0)
    }
}