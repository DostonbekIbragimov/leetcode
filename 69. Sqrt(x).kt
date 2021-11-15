class Sqrt {
    fun mySqrt(x: Int): Int {
        var num = sqrt(x * 1.0).toInt()
        when {
            num * num > x -> num -= 1
            num * num - x < 0.00001 -> num = num
            else -> num += 1
        }
        return num
    }
}