//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

//k

//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
// to see how IntelliJ IDEA suggests fixing it.
//TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
// for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.

fun main(args: Array<String>) {


    val songOne = Song("The Mesopotamians", "They Might Be Giants")
    val songTwo = Song("Going Underground", "The Jam")
    val songThree = Song("Make Me Smile", "Steve Harley")
    songTwo.play()
    songTwo.stop()
    songThree.play()
}

fun rockPaperScissors() {
    while (true) {
        val options = arrayOf("Rock", "Paper", "Scissors")
        val gameChoice = getGameChoice(options)
        val userChoice = getUserChoice(options)
        printResult(userChoice, gameChoice)
    }
}

fun getGameChoice(optionsParam: Array<String>) =
    optionsParam[(Math.random() * optionsParam.size).toInt()]

fun getUserChoice(optionsParam: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice) {
        print("Please enter one of the following:")
        for (item in optionsParam) print(" $item")
        println(".")
        //Прочитать пользовательский ввод
        val userInput = readLine()
        //Проверить пользовательский ввод
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //Если выбран недопустимый вариант, сообщить пользователю
        if (!isValidChoice) println("You must enter a valid choice.")
    }
    return userChoice
}

fun printResult(userChoice: String, gameChoice: String) {
    val result: String
    //Определить результат
    if (userChoice == gameChoice) result = "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
            (userChoice == "Paper" && gameChoice == "Rock") ||
            (userChoice == "Scissors" && gameChoice == "Paper")) result = "You win!"
    else result = "You lose!"
    //Вывести результат
    println("You chose $userChoice. I chose $gameChoice. $result")
}

fun example(optionsParam: Array<String>): Unit {
    val options = arrayOf(
        "Rock",
        "Paper",
        "Scissors"
    )
    var x = 1
    val x2: String = buildString {
        append("bg6z100260")
    }

    for (x in 1..10) {
        println(x)
    }

    for (x in 15 downTo 1) {
        println(x)
    }

    for (item in optionsParam) {
        println("$item is an item in the array")
    }

    for (index in optionsParam.indices) {
        println("Index $index has item ${optionsParam[index]}")
    }

    for ((index, item) in optionsParam.withIndex()) {
        println("Index $index has item $item")
    }

    class Person {

    }


}
/*

val nameVar = "Kotlin"
var x = 1


    while (x < 3) {
        print (if (x == 1) "Yab" else "Dab")
        print ("ba")
        x = x + 1
    }
    if (x == 3) println("Do")
    println("Hello, $name!")
val name = "Misty" Объявить переменную с именем ‘name’ и присвоить ей значение “Misty”.
val height = 9 объявляет переменную height и присваивает значение 9
println("Hello") выводит строку
println("My cat is called $name")
println("My cat is $height inches tall")
val a = 6
val b = 7
val c = a + b + 10 с = 23
val str = c.toString() преобразование переменной "с" в строкового типа
val numList = arrayOf(1, 2, 3) объявление массива
var x = 0
while (x < 3) { //условие при котором будет выплнятся цикл
    println("Item $x is ${numList[x]}")
    x = x + 1
} будет выведено
val myCat = Cat(name, height)
val y = height - 3
if (y < 5) myCat.miaow(4)
while (y < 8) {
    myCat.play()
    y = y + 1
}*/
