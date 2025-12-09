package org.example.day2

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IdValidatorTest {
    val validator = IdValidator()

    @Test
    fun should_sum_invalid_ids() {
        val input = "11-22,95-115,998-1012,1188511880-1188511890,222220-222224," +
                "1698522-1698528,446443-446449,38593856-38593862,565653-565659," +
                "824824821-824824827,2121212118-2121212124"

        val result = validator.sumInvalidIds(input)

        assertEquals(1227775554, result)
    }
}