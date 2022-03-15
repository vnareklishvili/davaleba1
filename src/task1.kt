////task1///////
import kotlin.math.round

fun main(int: Array<String>) {
    var numArray = intArrayOf(20,30,40,50,60)
    var sum = 0.0

    for (num in numArray) {
        sum += num
    }
    val average = sum / numArray.size
    println(round(average))

}



