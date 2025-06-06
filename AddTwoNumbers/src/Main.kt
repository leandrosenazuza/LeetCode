/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun main() {
    var solution = Solution()

    var l1 = ListNode(1)
    l1.next = ListNode(2)
    l1.next!!.next = ListNode(3)
    //123

    var l2 = ListNode(3)
    l2.next = ListNode(4)
    l2.next!!.next = ListNode(5)
    //345

    solution.addTwoNumbers(l1, l2)
}


class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2
        var cabeca = ListNode(0)
        var current = cabeca
        var carry = 0


        while(node1 != null || node2 != null || carry != 0){
            var v1 = node1?.`val` ?: 0
            var v2 = node1?.`val` ?: 0

            var sum = v1 + v2 + carry

            current.next  = ListNode(sum % 10)
            current = current.next!!
            carry = sum / 10

            node1 = node1?.next
            node2 = node2?.next
        }

        return cabeca.next
    }
}


