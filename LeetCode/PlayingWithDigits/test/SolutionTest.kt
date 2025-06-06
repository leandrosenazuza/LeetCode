import Solution.digPow
import Solution.pow
import org.testng.Assert.assertEquals
import org.testng.annotations.Test

class SolutionTest{

    @Test
    fun testFixed() {
        assertEquals(1, digPow(89, 1))
        assertEquals(-1, digPow(92, 1))
        assertEquals(51, digPow(46288, 3))
    }

    @Test
    fun test_Pow(){
        assertEquals(81, pow(9, 2))
        assertEquals(729, pow(9, 3))
    }
}