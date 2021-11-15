class RomanToInteger {
   
    fun romanToInt(s: String): Int {
        val map: MutableMap<Char, Int> = HashMap()
        map['I'] = 1
        map['V'] = 5
        map['X'] = 10
        map['L'] = 50
        map['C'] = 100
        map['D'] = 500
        map['M'] = 1000

        var sum: Int? = map[s[s.length - 1]]
        for (i in s.length - 2 downTo 0) {
            sum = if (map[s[i]]!! >= map[s[i+1]]!!) {
                sum?.plus(map[s[i]]!!)
            } else {
                sum?.minus(map[s[i]]!!)
            }
        }

        return sum!!
    }
}