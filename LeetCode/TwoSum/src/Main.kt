import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var solution = Solution()

    var listInt: IntArray = scanner.nextLine().split(" ").map { it.toInt() }.toIntArray()

    var sumValue = scanner.nextInt()

    var list = solution.twoSum(listInt, sumValue)

    print(list.joinToString(" "))

}

class Solution {
    fun twoSum(nums: IntArray   , target: Int): IntArray {
        val intList = IntArray(2)
        for (i in 0..<nums.size) {
            for (j in 1..<nums.size) {
                if (nums[i] + nums[j] == target && i != j) {
                    intList[0] = i
                    intList[1] = j
                    return intList
                }
            }
        }
        return intList
    }
}