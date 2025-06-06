import org.junit.Test



class SolutionTest{
    private var solution = Solution()

    @Test
    fun twoSum_returnsCorrectResult() {
        val list = intArrayOf(2,7,11,15)
        val expected = intArrayOf(0, 1)
        val result = solution.twoSum(list, 9)

        assert(expected.contentEquals(result))

    }

    @Test
    fun twoSum_returnsCorrectResultAnotherArray() {
        val list = intArrayOf(3,2,4)
        val expected = intArrayOf(1,2)
        val result = solution.twoSum(list, 6)

        assert(expected.contentEquals(result))

    }

}