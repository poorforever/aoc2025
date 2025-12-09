import org.example.Utils
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream
import kotlin.test.assertEquals

class UtilsTest {
    @ParameterizedTest
    @MethodSource("params")
    fun should_find_max_joltage(bank: String, expected: Int) {
        val joltage = Utils.findMaxJoltage(bank)

        assertEquals(expected, joltage)
    }

    companion object {
        @JvmStatic
        fun params(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("987654321111111", 98),
                Arguments.of("811111111111119", 89),
                Arguments.of("234234234234278", 78),
                Arguments.of("818181911112111", 92),
            )
        }
    }
}