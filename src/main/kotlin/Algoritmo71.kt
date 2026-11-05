// Código original
// Enunciado:
// Criar um algoritmo que leia um valor de hora e informe
//quantos minutos se passaram desde o início do dia.
//
// prog lea44
//int hora, tminuto, minuto;
//imprima "\nentre com hora atual: ";
//leia hora;
//imprima "\nentre com minutos: ";
//leia minuto;
//tminuto <- hora * 60 + minuto;
//imprima "\nAte agora se passaram: " tminuto, " minutos";
//imprima "\n";
//fimprog

// Código em Kotlin

fun main() {
    print("\nEntre com a hora atual: ")
    val hora = readln().trim().toInt()

    print("\nEntre com os minutos: ")
    val minuto = readln().trim().toInt()

    val tminuto = hora * 60 + minuto

    println("\nAté agora se passaram: $tminuto minutos")
}