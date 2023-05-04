fun main() {
    var i = 0

    while (i < 101) {
        val rem = i % 2
        if (i <= 9) {
            i++
            continue
        }
        
        if (rem == 0) {
            println(i)
        }

        i++
    }
}