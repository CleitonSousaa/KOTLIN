fun main() {
    
    var contador = 1
    while (contador <= 5) {
        println(contador)
        contador++
    }
    println("Loop concluído.")


    var cont = 0
    while (cont < 5) {
        println("Iteração $contador")
        cont++
    }


    val lista = listOf("item1", "item2", "item3")
    var indice = 0
    while (indice < lista.size) {
        println(lista[indice])
        indice++
    }
    
    
    while (true) {
        println("Digite 'sair' para encerrar:")
        var entrada: String = readLine() ?: ""
        
        if (entrada == "sair") {
            break
        }
    }





}
