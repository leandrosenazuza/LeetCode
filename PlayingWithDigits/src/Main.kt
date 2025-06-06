fun  main() {

}

object Solution {
    fun digPow(n: Int, p: Int): Int {
        var listOfChar = n.toString().toCharArray()
        var sumValues = 0
        var sumIndices = 0

        for(i in listOfChar.indices){
            sumIndices = p + i
            sumValues += pow((listOfChar[i].toString().toInt()), sumIndices)
        }

        if(sumValues % n == 0){
            return sumValues / n
        }
        return -1
    }

    fun pow(base: Int, n: Int): Int {
        var potencia = 1
        for(i in 1..n){
            potencia *= base
        }
        return potencia
    }
}
