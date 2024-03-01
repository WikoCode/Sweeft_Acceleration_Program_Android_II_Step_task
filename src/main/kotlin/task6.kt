fun main() {
    val ds = ConstantTimeDeleteSet<Int>()
    ds.add(1)
    ds.add(2)
    ds.add(3)
    println("Initial set: $ds")

    ds.delete(2)
    println("After deleting 2: $ds")

    println("Contains 3? ${ds.contains(3)}")
    println("Contains 2? ${ds.contains(2)}")
}
/*
    This example essentially mirrors the functionality of a HashSet,
    where each element's presence is marked in a hash map
    (though directly using Boolean values here is somewhat redundant since the presence of a
     key in a map already signifies its inclusion in the set).
    The deletion and check operations are O(1) due to the nature of hash map operations.
*/

class ConstantTimeDeleteSet<T> {
    private val map = hashMapOf<T, Boolean>()

    fun add(item: T) {
        map[item] = true
    }

    fun delete(item: T) {
        map.remove(item)
    }

    fun contains(item: T): Boolean {
        return map.containsKey(item)
    }

    override fun toString(): String = map.keys.toString()
}


