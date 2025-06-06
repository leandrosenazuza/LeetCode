class SolutionTest{
    private var solution = Solution()
    @org.junit.jupiter.api.Test
    fun twoSum_returnsCorrectResult() {
        val sum = 11
        val list = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        val expected = intArrayOf(0, 9)
        val result = solution.twoSum(list, 11)

        assert(expected.contentEquals(result))

    }

}