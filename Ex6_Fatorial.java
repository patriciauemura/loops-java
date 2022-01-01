package br.com.dio.exercicios.loops;

import javax.swing.plaf.synth.SynthSpinnerUI;
import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.println("Número: ");
        numero = scan.nextInt();

        int multiplicacao = 1;

        System.out.print("Fatorial de " + numero + ": " );
        for(int i = numero; i >= 1 ;i-- ){
            multiplicacao = multiplicacao * i;
        }
        System.out.println(multiplicacao);
    }
}
