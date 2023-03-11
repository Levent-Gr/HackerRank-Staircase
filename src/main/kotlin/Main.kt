fun main(args: Array<String>) {
    staircase(50)
}

fun staircase(n: Int): Unit {

    var symbol = ""
    var space=""
    var newText = ""

    for(i in 0..n-1){

        symbol+="#"

        for (j in 0..(n-2)-i){
            space+=" "
        }
        newText = space+symbol

        println(newText)
        newText = ""
        space = ""

    }
}