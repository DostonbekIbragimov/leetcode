package uz.android.dostonbek.leetcode

import android.os.Build
import androidx.annotation.RequiresApi
import java.lang.Long.min


/**
 * Created by DostonbekIbragimov on 18, June, 2021
 */
class NumberOfDigitOne {
    private fun pow(a: Long, b: Long): Long {
        if (b == 0L) return 1L
        return if (b % 2 == 1L) a * pow(a, b - 1)
        else {
            val d = pow(a, b / 2)
            d * d
        }
    }

    @RequiresApi(Build.VERSION_CODES.N)
    fun countDigitOne(n: Int): Long {
        if (n <= 0) return 0
        var count = (n / 10) + if ((n % 10 != 0)) 1L else 0L
        var tens = 10L
        var c = 2L
        while (n != 0) {
            tens = pow(10, c++)
            count += (n / tens) * (tens / 10) + min((n % tens - (tens / 10) + 1).coerceAtLeast(0), (tens / 10))
            if (n / tens == 0L)
                break
        }
        return count
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    println(NumberOfDigitOne().countDigitOne(13))
    println(NumberOfDigitOne().countDigitOne(19))
    println(NumberOfDigitOne().countDigitOne(99))
}
