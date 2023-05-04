fun main() {
    val colours = arrayOf("black", "white", "red", "green") //similar to dictionaries

    if (colours.size < 5) {
        println("Rookie numbers")
    }

    for (x in colours) {
        print(x + " ")
    }
}