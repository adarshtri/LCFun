package problems

class GenerateParentheses22 {

    private var sols: MutableList<String> = mutableListOf()

    fun isValidSub(s: String): Boolean {
        var o = 0
        var c = 0
        var i = 0
        while(i < s.length) {
            if(s[i] == '(')
                o += 1
            else
                c += 1

            if (c > o)
                return false
            i += 1
        }

        return true
    }

    fun isValid(s: String): Boolean {
        var o = 0
        var c = 0
        var i = 0
        while(i < s.length) {
            if(s[i] == '(')
                o += 1
            else
                c += 1

            if (c > o)
                return false
            i += 1
        }

        return o == c
    }

    fun generate(cur: String, n: Int) {

        if(cur.length > 2*n)
            return

        var oS = "$cur("
        var cS = "$cur)"

        if(isValidSub(oS)) {
            if(oS.length == 2*n && isValid(oS))
                sols.add(oS)
            else
                generate(oS, n)
        }

        if(isValidSub(cS)) {
            if(cS.length == 2*n && isValid(cS))
                sols.add(cS)
            else
                generate(cS, n)
        }
    }

    fun generateParenthesis(n: Int): List<String> {
        generate("", n)
        return sols.toList()
    }

}