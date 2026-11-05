// Código original
// Enunciado:
// Uma pessoa resolveu fazer uma aplicação em uma poupança programada.
// Para calcular seu rendimento, ela deverá fornecer o valor constante da
// aplicação mensal, a taxa e o número de meses. Sabendo-se que a fórmula usada
// para este cálculo é:
//
//valor acumulado = P * (1+i)^n - 1 / i
//i = taxa
//P = aplicação mensal
//n = número de meses

// prog lea52
//real va, i, p;
//int n;
//imprima  "\ndigite o valor da aplicacao: ";
//leia p;
//imprima "\ndigite a taxa( 0 - 1) : ";
//leia i;
//imprima "\ndigite o numero de meses: ";
//leia n;
//va <-p*(((1+ i )** n)-1) / i;
//imprima "\nO valor acumulado: ", va;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("Digite o valor da aplicação: ")
    val p = readLine()!!.toDouble()

    print("Digite a taxa (0 - 1): ")
    val i = readLine()!!.toDouble()

    print("Digite o número de meses: ")
    val n = readLine()!!.toInt()

    val va = p * (Math.pow(1.0 + i, n.toDouble()) - 1) / i

    println("O valor acumulado: $va")
}