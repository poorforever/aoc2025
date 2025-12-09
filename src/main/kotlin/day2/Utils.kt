package org.example.day2

class Utils {
    companion object {
        fun getIdsInRange(range: String): Set<Long> {
            val (start, end) = range.split("-").map { it.toLong() }

            return LongProgression.fromClosedRange(start, end, 1).toSet()
        }

        fun isInvalid(value: Long): Boolean {
            val stringifiedValue = value.toString()

            if(stringifiedValue.length.mod(2) ==1 ) {
                return false
            }

            val halfLength = stringifiedValue.length / 2

            val first: String = value.toString().take(halfLength)
            val second: String = value.toString().takeLast(halfLength)

            return first == second
        }
    }
}