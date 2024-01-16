fun main(){
    var nome = "Maria"
    var idade = 25
    var profissao = "Progamadora web"
    val a = 10
    val b = 5
    val resultado = "A soma de $a e $b é ${a + b}"

    println("Meu nome e " + nome + " eu tenho " + idade + " anos e sou " + profissao)
    println("Meu nome e $nome eu tenho $idade anos e sou $profissao")
    println(resultado)
}