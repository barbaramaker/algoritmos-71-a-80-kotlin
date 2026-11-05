// Código original
// Enunciado:
// Dado um polígono convexo de n lados,
// podemos calcular o número de diagonais diferentes (nd)
// desse polígono pela fórmula : nd = n (n - 3) / 2.
// Fazer um algoritmo que leia quantos lados tem o polígono,
// calcule e escreva o número de diagonais diferentes (nd) do mesmo.
//
// prog lea51
//real nd;
//int n;
//imprima "\ndigite o numero de lados do poligono: ";
//leia n;
//nd <- n * ( n - 3) / 2;
//imprima "\nnumero de diagonais: " nd;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("Digite o número de lados do polígono: ")
    val n = readLine()!!.toInt()

    val nd = n * (n - 3) / 2.0

    println("Número de diagonais: $nd")
}