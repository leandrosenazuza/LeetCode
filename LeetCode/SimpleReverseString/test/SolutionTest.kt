import Solution.reverseLetter
import org.testng.Assert.assertEquals
import org.testng.annotations.Test


class SolutionTest{
    @Test
    fun `Basic Tests` () {
        val str = "krishan"
        assertEquals("nahsirk", reverseLetter("krishan"))
        assertEquals("nortlu", reverseLetter("ultr53o?n"))
        assertEquals("cba", reverseLetter("ab23c"))
        assertEquals("nahsirk", reverseLetter("krish21an"))
    }
}