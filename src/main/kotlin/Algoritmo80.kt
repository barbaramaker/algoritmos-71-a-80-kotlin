// Código original
// Enunciado:
// Criar um algoritmo que leia a quantidade de fitas
// que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel, mostrando as informações pedidas a seguir:
//• Sabendo que um terço das fitas são alugadas por mês, exiba o faturamento anual da locadora;
//• Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel. Sabendo que um décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas por mês;
//• Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.
//
// prog lea53
//int quant;
//real valAluguel, fatAnual, multas, quantFinal;
//imprima "\n Digite a quantidade de fitas: ";
//leia quant;
//imprima "\n Digite o valor do aluguel: ";
//leia valAluguel;
//fatAnual <- quant/3 * valAluguel * 12;
//imprima "\n Faturamento anual: ", fatAnual;
//multas <- valAluguel * 0.1 * (quant/3)/10;
//imprima "\n Multas mensais : ", multas;
//quantFinal <- quant - quant * 0.02 + quant/10; /* quant * 1.08  */
//imprima "\n Quantidade de fitas no final do ano : ", quantFinal;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("Digite a quantidade de fitas: ")
    val quant = readLine()!!.toInt()

    print("Digite o valor do aluguel: ")
    val valAluguel = readLine()!!.toDouble()

    val fatAnual = quant / 3.0 * valAluguel * 12
    println("Faturamento anual: $fatAnual")

    val multas = valAluguel * 0.1 * (quant / 3.0) / 10
    println("Multas mensais: $multas")

    val quantFinal = quant - quant * 0.02 + quant / 10.0
    println("Quantidade de fitas no final do ano: $quantFinal")
}