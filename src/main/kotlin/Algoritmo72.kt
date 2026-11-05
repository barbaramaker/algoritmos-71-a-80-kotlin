// Código original
// Enunciado:
// Criar um algoritmo que leia o valor de um depósito e
//o valor da taxa de juros. Calcular e imprimir o valor
//do rendimento e o valor total depois do rendimento.
//
// prog lea45
//real deposito, taxa, valor, total;
//imprima "\nentre com depósito: ";
//leia deposito;
//imprima "\nentre coma taxa de juros: ";
//leia taxa;
//valor <- deposito * taxa / 100;
//total <- deposito + valor;
//imprima "\nRendimentos: ", valor, "\nTotal : " total;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com o valor do depósito: ")
    val deposito = readln().trim().toDouble()

    print("\nEntre com a taxa de juros: ")
    val taxa = readln().trim().toDouble()

    val valor = deposito * taxa / 100
    val total = deposito + valor

    println("\nRendimento: R$ $valor")
    println("Total: R$ $total")
}