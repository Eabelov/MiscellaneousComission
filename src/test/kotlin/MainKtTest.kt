import org.junit.Assert.*

class MainKtTest {

    @org.junit.Test
    fun discountingAddComissionVK() {
        val result = discounting("VK", 100, 500)
        assertEquals(500, result)
    }
    @org.junit.Test
    fun discountingNotComissionVK() {
        val result = discounting("VK", 100, 500)
        assertEquals(500, result)
    }
    @org.junit.Test
    fun discountingNotComissionMM() {
        val result = discounting("MM", 100, 500)
        assertEquals(500, result)
    }
    @org.junit.Test
    fun discountingAddComissionMM() {
        val result = discounting("MM", 100, 75_000)
        assertEquals(69355, result)
    }

    @org.junit.Test
    fun discountingAddMinComissionVM() {
        val result = discounting("VM", 100, 59)
        assertEquals(24, result)
    }
    @org.junit.Test
    fun discountingAddMaxComissionVM() {
        val result = discounting("VM", 100, 1_000)
        assertEquals(925, result)
    }
    @org.junit.Test
    fun discountingOverVimitVM() {
        val result = discounting("VM", 100, 900_000)
        assertEquals(0, result)
    }
}