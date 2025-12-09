package org.example.day2

class IdValidator {
    fun sumInvalidIds(input: String): Long {
        return input.split(",")
            .map { Utils.getIdsInRange(it) }
            .flatten()
            .filter { Utils.isInvalid(it) }
            .sum()
    }
}