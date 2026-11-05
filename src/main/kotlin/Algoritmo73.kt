// Código original
// Enunciado:
// Criar um algoritmo que receba um número real, calcular
//e imprimir:
//- A parte inteira do número;
//- A parte fracionária do número;
//- O número arredondado.
//
// prog lea46
//real num, numfrac;
//int numi, numa;
//imprima "\nentre com um numero com parte fracionaria: ";
//leia num;
//numi <- realint((num - 0.5));
//numfrac <- num - numi;
//numa <- realint(num + 0.00001);
//imprima "\nparte inteira: ", numi;
//imprima "\nparte fracionaria: ", formatar((numfrac + 0.00001), 3);
//imprima "\nnumero arredondado: ", numa;
//imprima "\n";
//fimprog

// Código em Kotlin

import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    print("\nEntre com um número com parte fracionária: ")
    val num = readln().trim().toDouble()

    val numi = floor(num).toInt()
    val numfrac = num - numi
    val numa = num.roundToInt()

    println("\nParte inteira: $numi")
    println("Parte fracionária: ${"%.3f".format(numfrac)}")
    println("Número arredondado: $numa")
}