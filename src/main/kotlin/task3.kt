fun main() {
    // Example words
    val words = arrayOf("Deer" , "Dense" , "Dead")
    println("The longest common prefix is: '${longestPrefix(words)}'")
}

/*
    This method involves comparing prefixes of each string one by one,
    updating the longest common prefix as it proceeds through the array.
*/

fun longestPrefix(array: Array<String>): String {
    if (array.isEmpty()) return ""
    var prefix = array[0]
    for (i in 1 until array.size) {
        while (array[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0 , prefix.length - 1)
            if (prefix.isEmpty()) return ""
        }
    }
    return prefix
}