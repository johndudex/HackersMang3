fun main () {

    var cordinate1 = Cordinate(1, 4)
    var cordinate2 = Cordinate(2, 6)

    var cordinate3 = cordinate1 add cordinate2

    var cordinate4 = cordinate1 + cordinate2


    println("x = ${cordinate3.x} y=${cordinate3.y}")
    println("x = ${cordinate4.x} y=${cordinate4.y}")



}

class Cordinate(x_cord: Int, y_cord :Int) {
    var x = x_cord
    var y = y_cord

    infix fun add(otherCordinate: Cordinate) : Cordinate{ return Cordinate( x +otherCordinate.x, y+otherCordinate.y)}

    operator fun plus(otherCordinate: Cordinate) : Cordinate{ return Cordinate( x +otherCordinate.x, y+otherCordinate.y)}


}