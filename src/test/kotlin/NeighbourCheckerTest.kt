import org.example.NeighbourChecker
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.io.File
import java.util.stream.Stream
import kotlin.test.assertEquals

class NeighbourCheckerTest {
    val file = File("src/test/resources/input.txt")
    val grid = file.readLines()
    val neighbourChecker = NeighbourChecker(grid)

    @Test
    fun should_count_admissibles() {
        // Open text as file to avoid edge cases with \n character
        assertEquals(13, neighbourChecker.countAdmissibles())
    }

    @ParameterizedTest
    @MethodSource("values")
    fun should_get_values(row: Int, column: Int, expected: String) {
        assertEquals(expected, neighbourChecker.getValue(row, column))
    }

    companion object {
        @JvmStatic
        fun values(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(0, 0, "."),
                Arguments.of(0, 9, "."),
                Arguments.of(1, 0, "@"),
                Arguments.of(1, 1, "@"),
                Arguments.of(1, 2, "@"),
                Arguments.of(1, 3, "."),
                Arguments.of(4, 0, "@"),
                Arguments.of(9, 9, "."),
            )
        }
    }
}