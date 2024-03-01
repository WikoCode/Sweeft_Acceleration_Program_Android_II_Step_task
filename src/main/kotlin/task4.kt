fun main() {
    val a = "10101"
    val b = "10110"
    println("Sum of $a and $b is: ${addBinary(a , b)}")
}

/*
    This approach involves iterating through the strings from the end towards the beginning,
    simulating the addition bit by bit and handling the carry.
*/
fun addBinary(a: String , b: String): String {
    val sb = StringBuilder()
    var i = a.length - 1
    var j = b.length - 1
    var carry = 0
    while (i >= 0 || j >= 0 || carry > 0) {
        var sum = carry
        if (i >= 0) sum += a[i--] - '0'
        if (j >= 0) sum += b[j--] - '0'
        sb.append(sum % 2)
        carry = sum / 2
    }
    return sb.reverse().toString()
}