fun main() {
    // Example amount
    val stairsCount = 24
    println("Number of ways to climb $stairsCount stairs: ${countVariants(stairsCount)}")
}
/*
    Since the problem essentially boils down to finding the nth Fibonacci number,
    we can solve it iteratively using two variables to store intermediate results, making it more space-efficient.
*/
fun countVariants(stairsCount: Int): Int {
    if (stairsCount == 0 || stairsCount == 1) return 1
    var a = 1
    var b = 1
    for (i in 2..stairsCount) {
        val sum = a + b
        a = b
        b = sum
    }
    return b
}