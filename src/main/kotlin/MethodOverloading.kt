fun main(args: Array<String>) {
  addition(12, 34.0)
  addition(453, 675.0, 89)
}


fun addition(x:Int, y:Double){
    var jibu = x + y
    println("Your answer from fun1 is $jibu")
}

fun addition(x:Int, y: Double, z:Int){
    var jibu = x + y + z
    println("Your answer from fun2 is $jibu")
}