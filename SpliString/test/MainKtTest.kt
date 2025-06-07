import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class MainKtTest {

    @Test
    fun basicTests() {
        assertEquals(listOf<String>(), solution(""), "Should handle empty string")
        assertEquals(listOf("ab", "cd", "ef"), solution("abcdef"), "Should handle even string")
        assertEquals(listOf("ab", "cd", "ef", "g_"), solution("abcdefg"), "Should handle odd string")
    }
}