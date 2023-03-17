package oop

fun main(args: Array<String>) {
    //Inheritance and Polymorphism
    var std1 = Student("Shem", "shem@gmail.com",
        "shem123")
    var std2 = Student("Reinhard", "mwasiscko@gmail.com",
        "mwas118")
    std1.login()
    std2.register()

    var t1 = Teacher("Reinhard", "mwas@gmail.com",
        "mwas118")
    t1.register()
    t1.login()
    t1.suspendStudent()

    var ht1 = HeadTeacher("Mwaura", "mwaura@gmail.com",
        "mwaura808")
    ht1.register()
    ht1.approveFunds()
    ht1.suspendStudent()
    ht1.login()
}

open class Student(open var name:String, open var email:String, open var password:String){

    fun register(){
        println("You registered with email $email and password $password")

    } fun login() {
        println("You logged in with email $email and password $password")
    }
}

open class Teacher( name:String, email: String, password: String):Student(name, email, password){
    fun suspendStudent(){
        println("Yeah, I can suspend a student")
    }
}

class HeadTeacher(name:String, email: String, password: String):Teacher(name, email, password ){
    fun approveFunds(){
        println("Yeah, I can approve funds")
    }
}