fun main(){
    // Imprimi de 1 a 5
    for (i in 1..5) {
        println(i)
    }
    
    // Imprimira "a", "b" e "c"
    val lista = listOf("a", "b", "c")
    for (elemento in lista) {
        println(elemento)
    }
    
    // Imprimira "Índice: 0, Valor: um", "Índice: 1, Valor: dois", "Índice: 2, Valor: tres"
    val array = arrayOf("um", "dois", "tres")
    for ((indice, valor) in array.withIndex()) {
        println("Índice: $indice, Valor: $valor")
    }
    
    // Imprimira de 5 a 1
    for (i in 5 downTo 1) {
        println(i)
    }
    
    // Imprimira 1, 3, 5, 7, 9
    for (i in 1 until 10 step 2) {
        println(i)
    }

    // Imprimira 1, 2, 3, 4, 5 
    val numeros = intArrayOf(1, 2, 3, 4, 5)
    for (numero in numeros) {
        println(numero)
    }

}