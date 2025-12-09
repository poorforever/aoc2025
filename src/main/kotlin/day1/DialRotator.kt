package org.example.day1

class DialRotator(
    var dial: Int = 50,
    val regex: Regex = Regex("^([LR])(\\d+)$"),
    val range: Int = 100,
    var zeros: Int = 0,
    var crossings: Int = 0,
) {
    fun rotate(input: String) {
        val (direction, step) = regex.find(input)!!.destructured

        val orientation = getNumericalDirection(direction)

        dial = correct(dial + orientation * step.toInt())

        println("Dial is currently $dial")

        if(dial == 0) zeros = zeros.inc()
    }

    private fun getNumericalDirection(char: String): Int {
        return when (char) {
            "L" -> -1
            "R" -> 1
            else -> {throw IllegalArgumentException("$char is not supported")
            }
        }
    }

    private fun correct(dial: Int): Int {
        return if(dial < 0) {
            crossings = crossings.inc()
            range + dial
        } else if (dial > 99) {
            crossings = crossings.inc()
            dial - range
        } else
            dial
    }
}