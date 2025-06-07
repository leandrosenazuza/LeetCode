fun solution(str: String): List<String> {
    var s = str.toCharArray()
    var newList = mutableListOf<String>()
    var size = s.size

    if(s.isEmpty()) {
        return listOf()
    } else if(size % 2 == 0) {
        for(i in 0..size - 2 step 2)  {
            newList.add(s[i].toString() + s[i+1].toString())
        }
    } else {
        for(i in 0..size - 3 step 2)  {
            newList.add(s[i].toString() + s[i+1].toString())
        }
        newList.add(s[size - 1].toString() + "_")
    }

    return newList
}