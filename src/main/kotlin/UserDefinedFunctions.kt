fun main(args: Array<String>) {
    motto()
    add()
    avg(200,500.0, 800.0f)
    println(sum(200, 3643.7, 75634))
}

fun motto(){
    println("Hello, this is our motto")
}

fun add(){
    var x = 10
    var y = 20
    var z = x + y
    println(z)
}

fun avg(x:Int, y:Double, z:Float){
    var answer = (x + y + z) / 3.0
    println("Your average is $answer")
}

fun sum(x: Int, y: Double, z:Int):Double{
    var jibu = x + y + z
    return jibu
}