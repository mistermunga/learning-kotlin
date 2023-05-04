fun main() {
    print("What day of the week is it? (input a number from 1 to 7) ")
    val x = readln()

    val y = when(x) {
        "1" -> "Sunday"
        "2" -> "Monday"
        "3" -> "Tuesday"
        "4" -> "Wednesday"
        "5" -> "Thursday"
        "6" -> "Friday"
        "7" -> "Saturday"
        else -> "invalid"
    }

    print(y)
}