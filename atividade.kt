
fun main() {

    println("Escolha uma Atividade" +
            ":")
    println("1 - Loop While")
    println("2 - Loop do-While-1")
    println("3 - Loop do-While-2 ")
    println("4 - Loop do-While-3")
    println("5 - Loop For-1")
    println("6 - Loop do-While-3")
    println("7 - Loop do-While-3")


    val opcao = readLine()?.toInt()

    when (opcao) {
        1 -> ativ1()
        2 -> ativ2()
        3 -> ativ3()
        4 -> ativ4()
        5 -> ativ5()
        6 -> ativ6()
        else -> println("Opção inválida")
    }
}

fun ativ1() {
    println("1 - Faça um loop while que imprima todos os números de 1 a 10:")
    var numero = 1
    while (numero <= 10) {
        println(numero)
        numero++

        println("2 - Faça um loop while que imprima todos os números pares de 0 a 20:")
        var par = 0
        while (par <= 20) {

            if (par % 2 == 0) {
                println(par)
            }
            par++
        }

//3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:

        var imp = 9
        while (imp >= 1) {
            println(imp)
            imp -= 2
        }
    }
}

//Loop Do-While:


fun ativ2(){
    println("Faça um loop do-while que imprima todos os números de 1 a 10:")
        var a = 1
        do {
            println(a)
            a++
        } while (a <= 10)
    }

fun ativ3() {
    println("2 - Faça um loop do-while que peça ao usuário para digitar um número até que ele digite um número negativo:")
            var b: Int
            do {
                print("Digite um número *digite um número negativo para encerrar*")
                b = readLine()!!.toInt()
                if (b >= 0) {
                    println("VOcê digitou esse número $b")
                }
            } while (b >= 0)
            println("Finalizando...")

        }
fun ativ4() {
    println("3 - Faça um loop do-while que peça ao usuário para digitar um número de 1 a 10 até que ele acerte o número sorteado:")
    val numSorteado = (1..10).random()
    var c: Int
    do {
        print("Digite um número de 1 a 10: ")
        c = readLine()!!.toInt()
        if (c == numSorteado) {
            println("Parabéns, você acertou o número sorteado!")
        } else {
            println("Você errou, tente novamente.")
        }
    } while (c != numSorteado)
}


fun ativ5(){
        println("1 - Faça um loop for que imprima todos os números de 1 a 10:")
        for (num in 1..10){
            println(num)
        }

    }
//
fun ativ6(){
    println("2 - Faça um loop for que imprima todos os números pares de 0 a 20:")
    for(num in 0..10){
        println(num * 2)
    }

}





















