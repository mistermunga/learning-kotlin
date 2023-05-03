fun main() {
    val myname = "Ryan"
    val surname = "Munga"

    print(myname)
    print(" ")
    println(surname)
    print(myname[0])
    println(surname[0])

    var fullname = myname.plus(surname)
    println(fullname)
    println(fullname == myname)
    println(fullname.indexOf("Munga"))
    println("my name is $surname, $myname $surname")

}