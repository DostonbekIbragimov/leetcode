
import kotlin.math.abs


/**
 * Created by DostonbekIbragimov on 17, June, 2021
 */
class Solution {
    fun reverse(x: Int): Int {
        var ans = 0L
        val max_int = Int.MAX_VALUE
        val comp = if (x > 0) 1 else if (x < 0) -1 else 0
        val str = abs(x).toString().reversed()
        for (i in str.indices) {
            ans *= 10
            ans += (str[i] - '0') % 10
            if (ans > max_int)
                return 0
        }
        return if (ans * comp > max_int) 0 else (ans * comp).toInt()
    }
}

fun main() {
    println(Solution().reverse(1534236469))


}