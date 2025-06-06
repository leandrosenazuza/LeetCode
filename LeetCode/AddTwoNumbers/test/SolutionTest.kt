import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test


class SolutionTest{

    @Test
    fun addTwoNumbers_returnsCorrectResult(){
        val solution = Solution()
        //321
        val list1 = ListNode(1)
        list1.next = ListNode(2)
        list1.next!!.next = ListNode(3)

        //123
        val list2 = ListNode(3)
        list2.next = ListNode(2)
        list2.next!!.next = ListNode(1)

        val listExpectedResult = ListNode(4)
        listExpectedResult.next = ListNode(4)
        listExpectedResult.next!!.next = ListNode(4)

        //321 + 123 = 444
        val result = solution.addTwoNumbers(list1, list2)

        assertTrue(compareTwoLists(result, listExpectedResult))
    }

    fun compareTwoLists(result: ListNode?, listExpectedResult: ListNode?): Boolean {
        if(result?.`val` != listExpectedResult?.`val`) return false
        if(result?.next!!.`val` != listExpectedResult?.next!!.`val`) return false
        if(result.next!!.next!!.`val` != listExpectedResult.next!!.next!!.`val`) return false
        return true
    }

}