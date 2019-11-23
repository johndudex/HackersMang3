fun main() {
    println("Hello From Kotlin")

    print("John Smith".AlternateCapital())

}

fun String.AlternateCapital() : String {

    var stringArray = this.toCharArray()

    for (i in 0 .. this.length-1) {
        if (i%2 ==0) stringArray[i] = this[i].toUpperCase()
        else stringArray[i] = this[i]
    }
    return  String(stringArray)
}
