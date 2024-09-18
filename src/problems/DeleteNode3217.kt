package problems

import problems.types.ListNode


class DeleteNode3217(override val problemLink: String) : Problem() {

    fun modifiedList(nums: IntArray, head: ListNode?): ListNode? {
        if(head == null)
            return null

        val nMap = mutableMapOf<Int, Boolean>()
        nums.forEach {
            nMap[it] = true
        }

        var pHead: ListNode? = null
        var tHead = head

        var rHead = head

        while(tHead != null) {
            if(tHead.`val` in nMap) {
                if(pHead == null) {
                    tHead = tHead.next
                    rHead = tHead
                } else {
                    pHead.next = tHead.next
                    tHead = tHead.next
                }
            } else {
                pHead = tHead
                tHead = tHead.next
            }
        }
        return rHead
    }

}