package day1

import org.example.day1.DialRotator
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class DialRotatorTest {
    val dialRotator = DialRotator();

    @ParameterizedTest
    @MethodSource("params")
    fun should_rotate(input: String, expected: Int) {
        val result = dialRotator.rotate(input);

        assertEquals(expected, result);
    }

    companion object {
        @JvmStatic
        fun params(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("L0", 50),
                Arguments.of("R0", 50),
            )
        }
    }
}