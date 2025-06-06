package kata

fun main() {
    KataSolution.multiplicationTable(3)

    println(KataSolution.multiplicationTable(1).toString())

}

object KataSolution {
    fun multiplicationTable(size: Int): Array<IntArray> {
        return Array(size) { row ->
            IntArray(size) {
                col -> (row + 1) * (col + 1)
            }
        }
    }
}

