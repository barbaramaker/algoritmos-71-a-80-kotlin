// Código original
// Enunciado:
// Para vários tributos, a base de cálculo é o salário mínimo.
//Fazer um algoritmo que leia o valor do salário mínimo
//o valor do salário de uma pessoa. Calcular e imprimir
//quantos salários mínimos ela ganha.
//
// prog lea47
//real salmin, salpe, num;
//imprima "\nentre com o salario minimo: ";
//leia salmin;
//imprima "\nentre com o salario da pessoa: ";
//leia salpe;
//num <- salpe / salmin;
//imprima "\na pessoa ganha ", num, " salarios mínimos";
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o salário mínimo: ")
    val salmin = readln().trim().toDouble()

    print("\nEntre com o salário da pessoa: ")
    val salpe = readln().trim().toDouble()

    val num = salpe / salmin

    println("\nA pessoa ganha $num salários mínimos.")
}