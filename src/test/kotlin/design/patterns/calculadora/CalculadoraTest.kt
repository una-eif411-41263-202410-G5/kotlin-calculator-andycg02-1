package design.patterns.calculadora

import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class CalculadoraTest {
    @Test
    fun `testing sumar from calculador`() {
        val calculadora = Calculadora()

        var num1 = 12
        var num2 = 8
        var res = calculadora.sumar(num1, num2)

        assertEquals(res, 20)
    }

    @Test
    fun `testing restar from calculador`() {
        val calculadora = Calculadora()

        var num1 = 10
        var num2 = 5
        var res = calculadora.restar(num1, num2)

        assertEquals(res, 5)
    }

    @Test
    fun `testing multiplicar from calculador`() {
        val calculadora = Calculadora()

        var num1 = 5
        var num2 = 5
        var res = calculadora.multiplicar(num1, num2)

        assertEquals(res, 25)
    }

    @Test
    fun `testing dividir from calculador`() {
        val calculadora = Calculadora()

        var num1 = 12
        var num2 = 2
        var res = calculadora.division(num1, num2)

        assertEquals(res, 6)
    }
}
