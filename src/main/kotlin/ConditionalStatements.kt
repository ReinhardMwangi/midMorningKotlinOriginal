fun main(args: Array<String>) {
    //IF STATEMENTS
    var age = 20
    if (age < 18) {
        println("You are underage")
    }else{
        println("Welcome to the party")
    }

    var weight = 100
    var height = 1.9
    var bmi = weight/ (height * height)
    if (bmi <= 18){
        println("Underweight")
    }else if (bmi <= 24){
        println("Normal weight")
    }else if (bmi <= 29){
        println("Overweight")
    }else{
        println("Obese")
    }
     var score = 100
    if (score < 45){
        println("Your grade is below average")
    }else if (score > 70){
        println("You have passed")
    }else if (score >50){
        println("Your grade above average")
    }

    //WHEN STATEMENTS
    var bettingNumber = 0
    when(bettingNumber){
        1 -> {
            println("You lost")
        }
        2 -> {
            println("You lost")
        }
        3 -> {
            println("You won")
        }
        4 -> {
            println("You lost")
        }
        else ->{
            println("Please enter a number from 1 - 4 to bet")
        }
    }

}