fun main() {
    // Example amount
    val amount = 68

    val minimumCoins = minSplit(amount)

    println("Minimum coins needed for $amount cent: $minimumCoins")
}

/*
    This is a recursive approach, which tries to find the minimum number of coins for the amount by recursively
    reducing the problem size. It's more of a "textbook" example than a practical one for this problem.
*/

fun minSplit(amount: Int): Int {

    if (amount == 0) return 0
    val denominations = intArrayOf(50 , 20 , 10 , 5 , 1)
    var minCoins = Int.MAX_VALUE

    for (denomination in denominations) {
        if (amount - denomination >= 0) {
            val coins = minSplit(amount - denomination) + 1
            minCoins = minOf(minCoins , coins)
        }
    }
    return if (minCoins == Int.MAX_VALUE) 0 else minCoins
}