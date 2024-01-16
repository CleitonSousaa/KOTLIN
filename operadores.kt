fun main(){
    // Adição
    val soma = 5 + 3
    println("Adição: $soma")

    // Subtração
    val subtracao = 7 - 2
    println("Subtração: $subtracao")

    // Multiplicação
    val multiplicacao = 4 * 6
    println("Multiplicação: $multiplicacao")

    // Divisão
    val divisao = 10 / 2
    println("Divisão: $divisao")

    // Módulo
    val modulo = 15 % 4
    println("Módulo: $modulo")

    // Incremento e Decremento
    var numero = 5
    numero++
    println("Incremento: $numero")

    numero--
    println("Decremento: $numero")

    // Operadores de atribuição combinada
    var x = 10
    x += 5
    println("Operador de atribuição combinada: $x")

    val a = 5
    val b = 10

    val isEqual = (a == b)
    val isNotEqual = (a != b)
    val isGreaterThan = (a > b)
    val isLessThan = (a < b)
    val isGreaterOrEqual = (a >= b)
    val isLessOrEqual = (a <= b)

    println("Equal: $isEqual")
    println("Not Equal: $isNotEqual")
    println("Greater Than: $isGreaterThan")
    println("Less Than: $isLessThan")
    println("Greater Or Equal: $isGreaterOrEqual")
    println("Less Or Equal: $isLessOrEqual")

}