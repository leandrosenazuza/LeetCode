object Solution {
    fun reverseLetter(str: String): String {
        var str = str.toCharArray()
        var sizeLetter = 0

        str.forEach {
             if (it.isLetter()) {
                sizeLetter++
            }
        }

        var listReversed = CharArray(sizeLetter)
        var indexReversed = sizeLetter - 1

        str.forEachIndexed { index, character ->
            run {
                if(character.isLetter()){
                    listReversed.set(indexReversed, character)
                    indexReversed--
                }
            }
        }

        return String(listReversed)

    }
}