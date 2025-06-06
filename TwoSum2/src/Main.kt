//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var solution = Solution()
    var testList: IntArray = intArrayOf(2, 7, 11, 15)
}


class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        nums.forEachIndexed { index, value ->
            val aux = target - value
            if(nums.contains(aux) && nums.indexOf(aux) != index){
                val position2 = nums.indexOf(aux)
                return intArrayOf(index, position2)
            }
        }
        return intArrayOf()
    }
}