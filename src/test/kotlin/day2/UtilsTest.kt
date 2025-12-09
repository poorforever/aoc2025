package org.example.day2

import org.example.day2.Utils.Companion.isInvalid
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class UtilsTest {
    @ParameterizedTest
    @MethodSource("params")
    fun should_assert_is_invalid(value: Long, expected: Boolean) {
        assertEquals(expected, isInvalid(value))
    }

    companion object {
        @JvmStatic
        fun params(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(11, true),
                Arguments.of(22, true),
                Arguments.of(1010, true),
                Arguments.of(1188511885, true),
                Arguments.of(222222, true),
                Arguments.of(446446, true),
                Arguments.of(38593859, true),
                Arguments.of(1024, false),
                Arguments.of(10, false),
                Arguments.of(9998, false),
                Arguments.of(999, false),
                Arguments.of(101, false),
            )
        }
    }
}