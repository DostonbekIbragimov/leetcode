class Solution {
    fun isPalindrome(x: Int): Boolean {
        if(x < 0) return false
        val str = x.toString()
        val len = str.length
        for (i in 0..len / 2) {
            if (str[i] - '0' != str[len - i - 1] - '0')
                return false
        }
        return true
    }
}