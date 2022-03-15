

fun main(args: Array<String>) {
    val word = "ale ela"

    var reversWord = ""
    var length = word.length

    for (i in (length - 1) downTo 0) {
        reversWord = reversWord + word[i]
    }

    if (word.equals(reversWord, ignoreCase = true)) {
        println("SO TRUE <3")
    } else {
        println("FALSE")
    }
}