/**
 * Similar to lazy. Resettable lazy has a backing variable that acts as a cache. This cache can be invalidated by
 * calling [reset].
 */
class ResettableLazy<T>(
    private val initializer: () -> T
){
    val value: T
        get() = cache ?: initializer.invoke().also { cache = it }

    private var cache: T? = null

    /** Invalidates cache.
     * This ensures that, the next time [value] is accessed, it will recalculate cache by re-invoke initializer
     */
    fun reset(){
        cache = null
    }
}

fun main() {
    val x = ResettableLazy { 3 + 3 }
    println(x.value)
    println(x.value)
    x.reset()
    println(x.value)

}