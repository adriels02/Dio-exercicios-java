package exercicios_java;

import java.util.Scanner;

//Faça um programa em Java que leia 50 números e informe o maior número.

public class Maior50Numeros {

	public static void main(String[] args) {
		
		
	Scanner leitor = new Scanner(System.in);
	double maior = Double.MIN_VALUE;
		
		for (int i = 0 ; i < 50; i++) {
			
			System.out.println("Digite um numero");
			double numero = leitor.nextDouble();
			
			if (maior < numero) {
				maior = numero;
			}
			
		}
		
		System.out.println("O maior numero digitado e: " + maior);		
	}
}
