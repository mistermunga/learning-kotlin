fun main() {
    val y = 20
    var x = 5
    var z = 3
    var sum1 = y/x
    var rem1 = x%z
    var rem2 = y%z
    ++z
    --x
    var sum2 = y/x
    x += 10

    println(x)
    println(sum1)
    println(x + y + z)
}