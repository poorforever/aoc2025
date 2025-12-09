package day1

import org.example.day1.DialRotator
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class DialRotatorTest {
    lateinit var dialRotator: DialRotator
    @BeforeEach
    fun setUp() {
        dialRotator = DialRotator()
    }

    @ParameterizedTest
    @MethodSource("params")
    fun should_rotate(input: String, expected: Int) {
        dialRotator.rotate(input)

        assertEquals(expected, dialRotator.dial)
    }

    companion object {
        @JvmStatic
        fun params(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("L0", 50),
                Arguments.of("R0", 50),
                Arguments.of("L50", 0),
                Arguments.of("R50", 0),
                Arguments.of("L5", 45),
                Arguments.of("L37", 13),
                Arguments.of("R37", 87),
                Arguments.of("L51", 99),
                Arguments.of("L67", 83),
                Arguments.of("R51", 1),
                Arguments.of("R67", 17),
                Arguments.of("L68", 82),
            )
        }
    }
}