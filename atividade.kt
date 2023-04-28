
fun main() {

    var sair = false

    println("Escolha uma Atividade" +
            ":")
    println("1 - Loop While-1")
    println("2 - Loop While-2")
    println("3 - Loop While-3")
    println("---------")
    println("4 - Loop do-While-1")
    println("5 - Loop do-While-2 ")
    println("6 - Loop do-While-3")
    println("---------")
    println("7 - Loop For-1")
    println("8 - Loop For-2")
    println("9 - Loop For-3")
    println("---------")
    println("10- Range-1")
    println("11- Range-2")
    println("12- Range-3")
    println("---------")
    println("10- Range-1")
    println("11- Range-2")
    println("12- Range-3")
    println("---------")
    println("13- Continue, Break & Repeat:-1")
    println("14- Continue, Break & Repeat:-2")
    println("15- Continue, Break & Repeat:-3")
    println("---------")
    println("16- Strings-1")
    println("17- Strings-2")
    println("18- Strings-3")
    println("---------")
    println("19- Arrays-1")
    println("20- Arrays-2")
    println("21- Arrays-3")

    val opcao = readLine()?.toInt()

    when (opcao) {
        1 -> ativ1()
        2 -> ativ2()
        3 -> ativ3()
        4 -> ativ4()
        5 -> ativ5()
        6 -> ativ6()
        7 -> ativ7()
        8 -> ativ8()
        9 -> ativ9()
        10 -> ativ10()
        11 -> ativ11()
        12 -> ativ12()
        13 -> ativ13()
        14 -> ativ14()
        15 -> ativ15()
        16 -> ativ16()
        17 -> ativ17()
        18 -> ativ18()
        19 -> ativ19()
        20 -> ativ20()
        21 -> ativ21()
        else -> println("Opção inválida")
    }
}

fun ativ1() {
    println("1 - Faça um loop while que imprima todos os números de 1 a 10:")
    var numero = 1
    while (numero <= 10) {
        println(numero)
        numero++
    }
}
fun ativ2() {
        println("2 - Faça um loop while que imprima todos os números pares de 0 a 20:")
        var par = 0
        while (par <= 20) {

            if (par % 2 == 0) {
                println(par)
            }
            par++
        }
    }

fun ativ3() {
            println("3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:")
            var imp = 9
            while (imp >= 1) {
                println(imp)
                imp -= 2
            }
        }


//Loop Do-While:


fun ativ4(){
    println("Faça um loop do-while que imprima todos os números de 1 a 10:")
        var a = 1
        do {
            println(a)
            a++
        } while (a <= 10)
    }

fun ativ5() {
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

fun ativ6() {
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


fun ativ7(){
        println("1 - Faça um loop for que imprima todos os números de 1 a 10:")
        for (num in 1..10){
            println(num)
        }

    }

fun ativ8(){
    println("2 - Faça um loop for que imprima todos os números pares de 0 a 20:")
    for(num in 0..10){
        println(num * 2)
    }

}
fun ativ9(){
    println("3 - Faça um loop for que imprima todos os números ímpares de 10 a 0:")
    for (num in 10..0) {
        if (num % 2 != 0) {
            println(num)
        }
    }
}

//RANGE

fun ativ10() {
    println("1 - Crie um range de números de 1 a 10 e imprima cada número:")
    val a = 1..10
    for (num in a) {
        println(num)
    }
}

fun ativ11(){
    println("2 - Crie um range de letras de 'a' a 'z' e imprima cada letra:")
    val alfabeto = 'a'..'z'
    for (letra in alfabeto) {
        println(letra)
    }

}
fun ativ12() {
    println("3 - Crie um range de números de 1 a 100 e imprima apenas os números pares:")
    val numeros = 1..100
    for (num in numeros) {
        if (num % 2 == 0) {
            println(num)
        }
    }
}

//Continue, Break & Repeat:

fun ativ13() {
    println("1 - Escreva um programa que imprima todos os números de 0 a 10, exceto o número 5,usando continue.")
    for (num in 0..10) {
        if (num == 5) {
            continue
        }
        println(num)
    }
}

fun ativ14() {
    println("2 - Escreva um programa que leia números do usuário e pare quando o número digitado for negativo usando break.")
    var num: Int
    while (true) {
        print("Digite um número: ")
        num = readLine()!!.toInt()
        if (num < 0) {
            break
        }
    }

}

fun ativ15() {
    print("3 - Escreva um programa que leia um número inteiro positivo do usuário e imprima todos os números pares de 0 até o número digitado, exceto o número 4, usando continue e break.")

    print("Digite um número inteiro positivo: ")
    val numero = readLine()!!.toInt()

    for (i in 0..numero step 2) {
        if (i == 4) {
            continue
        }
        if (i > numero) {
            break
        }
        println(i)
    }
}
fun ativ16() {
    println("1 - Escreva um programa que leia uma frase do usuário e imprima quantos caracteres ela possui usando length.")
    print("Digite uma frase: ")
    val frase = readLine()!!
    val tamanho = frase.length
    println("A frase \"$frase\" possui $tamanho caracteres.")
}

fun ativ17() {
    println("2 - Escreva um programa que leia uma frase do usuário e imprima a mesma frase em ordem inversa usando loop for..")
    print("Digite uma frase: ")
    val frase = readLine()
    if (frase != null) {
        for (i in frase.length - 1 downTo 0) {
            print(frase[i])
        }
    }

}

fun ativ18() {
    println("3 - Escreva um programa que leia uma frase do usuário e imprima apenas as vogais da frase usando loop for e if.")
    print("Digite uma frase: ")
    val frase = readLine()?.lowercase()
    val vogais = "aeiou"
    var quantidadeVogais = 0

    for (letra in frase ?: "") {
        if (letra in vogais) {
            println(letra)
            quantidadeVogais++
        }
    }
    println("A -$frase$ possui $quantidadeVogais vogais.")
}
//string
fun ativ19(){
    println("1 - Escreva um programa que crie um array de 10 números inteiros aleatórios e imprima o maior número do array.")
    val a = IntArray(10) { (0..100).random() }
    var max = a[0]

    for (num in a) {
        if (num > max) {
            max = num
        }
    }

    println("O maior algoritimo é: $max")

}

fun ativ20(){
    println("2 - Escreva um programa que crie um array de 10 números inteiros digitados pelo usuário e imprima a média dos números do array.")
    val a = IntArray(10)

    for (i in 0 until a.size) {
        print("Digite o ${i+1}º número: ")
        a[i] = readLine()?.toInt() ?: 0
    }

    val med = a.average()

    println("A média dos números  é: $med")

}
fun ativ21(){
    println("3 - Escreva um programa que crie um array de 10 strings com nomes de frutas e imprima somente as frutas que começam com a letra \"a\" usando loop for e if.")
    val futa = arrayOf("banana", "maçã", "abacaxi", "laranja", "manga", "uva", "goiaba", "acerola", "abacate", "limão")
    for (futa in futa) {
        if (futa.startsWith("a")) {
            println(futa)
        }
    }
}
//DESAFIO
//Crie um programa em Kotlin que permita ao usuário digitar o nome e a idade de várias
//pessoas, armazenando essas informações em um array de objetos Pessoa. O
//programa deve ter as seguintes funcionalidades:
//
//Exercícios - semana 2 4
//1 - Permitir ao usuário adicionar uma nova pessoa ao array, informando o nome e a
//idade.
//2 - Exibir a lista de todas as pessoas adicionadas ao array, mostrando o nome e a
//idade de cada uma.
//3 - Exibir a média de idade das pessoas adicionadas ao array.
//4 - Permitir ao usuário buscar uma pessoa pelo nome, exibindo o nome e a idade
//correspondentes.
//5 - Permitir ao usuário remover uma pessoa pelo nome, atualizando o array e exibindo
//a lista atualizada.
//É aconselhado utilizar os conceitos de loop while, loop do-while, loop for, range,
//continue, break & repeat, string e array.

fun Desafio(){
    class Pessoa(val name: String, val age: Int)
    val pessoas = mutableListOf<Pessoa>()

    while (true) {
        println("Selecione a opção que vocẽ deseja")
        println("1 - Adicionar Pessoa")
        println("2 - Lista de Pessoas")
        println("3 - Média idade das pessoas")
        println("4 - Busca por nome")
        println("5 - Excluir por nome")
        println("6 - Encerrar")


    }


}
























