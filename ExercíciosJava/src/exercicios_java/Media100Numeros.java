package exercicios_java;

import java.util.Scanner;

//Faça um programa Java que leia 100 números e informe a média dos números.

public class Media100Numeros {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		double media = 0;
		double acumulador = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.print("Digite um numero ");
			double numero = leitor.nextDouble();
			
			
			acumulador = acumulador += numero;
			
			media = acumulador / 100;
					
		}
		
		System.out.println("A media dos numeros digitados e: " + media);
	}
}
