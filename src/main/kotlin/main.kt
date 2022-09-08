fun main(){
    var name:String
    var phone:String
    var business:String
    var status: String
    var stop = 0
    println("If you are a residential customer, press 1. If you are a business customer, press 2")
    while (stop != -1){
        if (readLine()!!.toInt() == 1){
            print("Please enter your full name: ")
            name = readln()
            print("\nNow enter your phone number. Make sure to include dashes where necessary: ")
            phone = readln()
            println(customer(name, phone))
            stop = -1
        } else if (readLine()!!.toInt() == 2){
            print("Please enter your full name: ")
            name = readln()
            print("\nNow enter your phone number. Make sure to include dashes where necessary: ")
            phone = readln()
            print("\nFinally, please enter your business's name:  ")
            business =  readln()
            println( customer(business, name, phone))
            stop = -1
        } else {
            println("You did not enter the number's 1 or 2, please try again")
        }
    }
}

fun customer(name: String, phoneNum: String):String{
    return ("Please check if this information is correct: Your name is $name and your phone number is $phoneNum")
}

fun customer(busName: String, name:String, phoneNum: String):String{
    return ("Please check if this information is correct: Your name is $name, your phone number is $phoneNum, and " +
            "your business is $busName")
}