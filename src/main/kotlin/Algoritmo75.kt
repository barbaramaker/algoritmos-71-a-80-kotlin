// Código original
// Enunciado:
// Criar um algoritmo que leia o peso de uma pessoa, só a parte inteira,
//calcular e imprimir:
//- O peso da pessoa em gramas;
//- Novo peso, em gramas, se a pessoa engordar 12%.
//
// prog lea48
//int peso, pesogramas, novopeso;
//imprima "\nentre com seu peso, só a parte inteira: ";
//leia peso;
//pesogramas <- peso * 1000;
//novopeso <- pesogramas * 1.12;
//imprima "\npeso em gramas: ", pesogramas;
//imprima "\nnovo peso: ", novopeso;
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com seu peso (somente a parte inteira): ")
    val peso = readln().trim().toInt()

    val pesogramas = peso * 1000
    val novopeso = pesogramas * 1.12

    println("\nPeso em gramas: $pesogramas")
    println("Novo peso após engordar 12%: $novopeso")
}