package design.patterns.design.patterns.calculadora

class Calculadora{

    //Suma
    fun sumar(a: Int, b: Int): Int{
        return a + b
    }

    //Resta
    fun restar(a: Int, b: Int): Int{
        return a - b
    }

    //Multiplicacion
    fun multiplicar(a: Int, b: Int): Int{
        return a * b
    }

    //Dividir
    fun division(a:Int, b:Int):Int{
        if (b == 0) {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
        return a / b
    }

}