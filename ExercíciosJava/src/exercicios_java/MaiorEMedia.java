package exercicios_java;

import java.util.Scanner;
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class MaiorEMedia {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double acumulado = 0;
		double maior;
		double[] numeros = new double[5];
		
		for (int i = 0; i < numeros.length;i++) {
			
			System.out.println("Digite um numero");
			numeros[i] = scan.nextDouble();			
		}
		
		maior = numeros[0];
		
		for (int i = 1; i < numeros.length;i++) {			
			if (numeros[i] > maior) {
				
				maior = numeros[i];
			}	
		}
		
		for (int i = 0; i < numeros.length;i++) {
			
			acumulado = acumulado += numeros[i];						
		}
				
		System.out.println("O maior numero digitado e: " + maior + " | E a soma dos numeros digitados e: " + acumulado);		
	}
}
