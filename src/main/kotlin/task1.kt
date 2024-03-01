fun main() {
    val nums = intArrayOf(4 , 1 , 2 , 1 , 2)

    val uniqueNumber = singleNumber(nums)

    println("The single number is: $uniqueNumber")
}

/*
    This method takes advantage of HashSet, which can be used to detect and remove duplicates.
    If the number is not in HashSet,add it; if it is already in HashSet, remove it.
    The last remaining number will be the unique one.
*/

fun singleNumber(nums: IntArray): Int {
    val seenNumbers = hashSetOf<Int>()
    for (num in nums) {
        if (!seenNumbers.add(num)) {
            seenNumbers.remove(num)
        }
    }
    return seenNumbers.first()
}