package problems

class LongestPalindromicString5(override val problemLink: String) : Problem() {

    fun expandAround(s: String, index: Int): String {
        var l = index
        var r = index
        var lp = s[index].toString()
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            lp = s.substring(l, r+1)
            r += 1
            l -= 1
        }

        return lp
    }

    fun expandAround(s: String, left: Int, right: Int): String {
        var l = left
        var r = right
        var lp = if(s[l] == s[r]) s.substring(l, r+1) else ""
        while (l >= 0 && r < s.length && s[l] == s[r]) {
            lp = s.substring(l, r+1)
            r += 1
            l -= 1
        }
        return lp
    }

    fun longestPalindrome(s: String): String {

        if(s.length == 2 && s[0] == s[1])
            return s

        var lP: String = ""
        var i = 0
        while(i < s.length) {
            var r = expandAround(s, i)
            if(r.length > lP.length)
                lP = r


            if(i != 0 && i != s.length-1) {
                r = expandAround(s, i-1, i)
                if(r.length > lP.length)
                    lP = r

                r = expandAround(s, i, i+1)
                if(r.length > lP.length)
                    lP = r
            }

            i += 1
        }
        return lP
    }

}