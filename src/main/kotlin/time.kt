import java.time.LocalTime

fun main() {
    var now = LocalTime.now()

    if (now.hour >= 0 && now.hour < 12) {
    println("Good morning")
    } else  if (now.hour >= 12 && now.hour <= 17){
        println("Good afternoon")
    } else {
        println("Good ebening")
    }
}