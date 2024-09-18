package problems.medium

import problems.Problem
import problems.types.ListNode


class DeleteMiddleNode2095(override val problemLink: String) : Problem() {
    fun deleteMiddle(head: ListNode?): ListNode? {

        if(head == null || head.next == null)
            return null

        var tHead: ListNode? = head

        var size = 0

        while(tHead != null) {
            size += 1
            tHead = tHead.next
        }

        var middleIndex = (size / 2).toInt()

        var pHead: ListNode? = null
        tHead = head

        var nodeCount = 0

        while(nodeCount != middleIndex) {
            pHead = tHead!!
            tHead = tHead.next
            nodeCount++
        }

        pHead!!.next = tHead?.next
        return head
    }
}