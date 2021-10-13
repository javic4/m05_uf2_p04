package cat.copernic.jmendezv

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class MainKtTest {

    @Test
    fun imcTest() {
        assertEquals(4, imc(4.0,3.0))
    }
}