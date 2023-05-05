import java.time.LocalTime

fun time() {
    var now = LocalTime.now()

    if (now.hour >= 0 && now.hour < 12) {
    println("Good morning")
    } else  if (now.hour >= 12 && now.hour <= 17){
        println("Good afternoon")
    } else {
        println("Good evening")
    }
}