// Código original
// Enunciado:
// Ler dois números reais e imprimir o quadrado da
// diferença do primeiro valor pelo segundo e a diferença
// dos quadrados.
//
// prog lea50
//real a, b, d, q;
//imprima "\ndigite 1 numero: "· '
//leia a;
//imprima "\ndigite 2 numero: "· '
//leia b;
//d <- (a - b)**2;
//q <-a**2 - b**2;
//imprima "\no quadrado da diferenca =",d , "\ndiferenca dos quadrados=", q;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {

    print("Digite o primeiro número: ")
    val a = readLine()!!.toDouble()

    print("Digite o segundo número: ")
    val b = readLine()!!.toDouble()

    val d = (a - b) * (a - b)
    val q = (a * a) - (b * b)

    println("O quadrado da diferença = $d")
    println("Diferença dos quadrados = $q")
}