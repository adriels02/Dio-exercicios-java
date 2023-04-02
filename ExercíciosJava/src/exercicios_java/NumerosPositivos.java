package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que leia uma quantidade indefinida de números positivos e imprima cada um deles. 
 Números negativos indicam o fim das leituras.
 */

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		for (;;) {
			
			System.out.print("Digite um numero. Caso seja um numero negativo o programa ira parar. ");
			double numero = leitor.nextDouble();
					
			System.out.println(numero);
			
			if (numero < 0) {
				break;
			}
				
		}		
	}
}
