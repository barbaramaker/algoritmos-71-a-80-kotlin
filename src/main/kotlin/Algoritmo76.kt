// Código original
// Enunciado:
// Criar um algoritmo que leia um número entre 0 e 60
// e imprimir o seu sucessor, sabendo que o sucessor de 60 é 0.
// Não pode ser utilizado nenhum comando de seleção e nem de repetição.
//
// prog leia49
//int num;
//imprima "\ndigite numero: ";
//leia num;
//imprima "\nsucessor: ", (num + 1) % 61;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("Digite um número: ")
    val num = readLine()!!.toInt()

    println("Sucessor: ${(num + 1) % 61}")
}