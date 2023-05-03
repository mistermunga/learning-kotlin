import java.time.LocalTime

fun main() {
    val x = 20
    val y = 15
    if (x > y) {
        println("X > Y")
    }
    var time: LocalTime = LocalTime.now()
    if (time.hour == 12 && time.minute == 0) {
        println("It's noon!")
    } else {
        println("it's not noon :(")
    }
}