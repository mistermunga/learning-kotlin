fun main() {
    for (char in 'a'..'z') {
        if (char == 'm') {
            continue
        }
        if (char == 'z') {
            println(char)
        } else {
            print("$char, ")
        }
    }
    println()
    myFunction()
}