package org.example

import java.lang.Integer.parseInt

class Utils {
    companion object {
        fun findMaxJoltage(bank: String): Int {
            var first = -1
            var second = -1
            var indexFirst = Integer.MAX_VALUE
            var indexSecond = Integer.MAX_VALUE

            bank.forEachIndexed { index, battery ->
                run {
                    if (parseInt(battery.toString()) > first && bank.length - index > 1) {
                        first = parseInt(battery.toString())
                        indexFirst = index
                    }

                    if (parseInt(battery.toString()) > second && index != indexFirst) {
                        second = parseInt(battery.toString())
                        indexSecond = index
                    }

                    if (indexSecond < indexFirst) {
                        second = -1
                    }
                }
            }

            return first.toString().plus(second.toString()).toInt()
        }
    }
}