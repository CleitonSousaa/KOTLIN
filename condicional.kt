fun main() {

    // if/else
    val numero = 10

    if (numero > 0) {
        println("O número é positivo.")
    } else if (numero < 0) {
        println("O número é negativo.")
    } else {
        println("O número é zero.")
    }


    // switch

    val diaDaSemana = 3

    val mensagem = when (diaDaSemana) {
        1 -> "Segunda-feira"
        2 -> "Terça-feira"
        3 -> "Quarta-feira"
        4 -> "Quinta-feira"
        5 -> "Sexta-feira"
        6 -> "Sábado"
        7 -> "Domingo"
        else -> "Dia inválido"
    }

    println("Hoje é $mensagem.")

    //atribuir o resultado em uma variável

    val num = 10

    val resultado = if (num > 0) {
        "O número é positivo."
    } else {
        "O número não é positivo."
    }

    println(resultado)


}
