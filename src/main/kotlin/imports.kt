fun main() {
    time()
    print("Enter your first name: ")
    val fname: String = readln()
    print("Enter your surname: ")
    val surname: String = readln()
    print("enter your age: ")
    val ageString = readln()
    val age = ageString.toByte()

    myNameFunction(fname, surname, age)

}