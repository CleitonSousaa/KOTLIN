fun main(){
    val dicionarioImutavel = mapOf(
    "chave1" to "valor1",
    "chave2" to "valor2",
    "chave3" to "valor3"
    )

    // Acessando Valores por Chave
    val valor = dicionarioImutavel["chave1"]
    println(valor) // Saída: valor1

    // Iterando sobre um Dicionário
    for ((chave, value) in dicionarioImutavel) {
        println("$chave: $value")
    }

    // Verificando se uma Chave Existe no Dicionário
    val contemChave = "chave1" in dicionarioImutavel
    println(contemChave)

    // Obtendo Todas as Chaves ou Valores
    val todasAsChaves = dicionarioImutavel.keys
    val todosOsValores = dicionarioImutavel.values
    println(todasAsChaves)
    println(todosOsValores)


    val dicionarioMutavel = mutableMapOf(
        "chave1" to "valor1",
        "chave2" to "valor2",
        "chave3" to "valor3"
    )

    // Adicionando e Removendo Pares Chave-Valor em Dicionários Mutáveis
    dicionarioMutavel["novaChave"] = "novoValor"
    dicionarioMutavel.remove("chave2")

    


    



}