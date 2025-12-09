package day1

import org.example.day1.DialRotator
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ZerosPasswordTest {
    val rawInput = """
        L68
        L30
        R48
        L5
        R60
        L55
        L1
        L99
        R14
        L82
    """.trimIndent()

    val inputs = rawInput.split('\n').filter(String::isNotEmpty)

    val dialRotator = DialRotator()

    @Test
    fun `should correctly rotate password`() {
        inputs.forEach { dialRotator.rotate(it) }

        assertEquals(3, dialRotator.zeros)
    }
}