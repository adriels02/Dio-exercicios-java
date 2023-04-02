package exercicios_java;

import java.util.Scanner;

//Faça um programa em Java que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao 
//segundo número. Utiliza estruturas de repetição para resolver o problema.

public class Exponenciacao {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a base ");
		double base = leitor.nextDouble();
		
		System.out.print("Digite o expoente ");
		int expoente = leitor.nextInt();
		
		double acumulador = 1;
		
		for (int i = 0 ; i < expoente; i++) {
			
			acumulador = acumulador *= base;		
		}
		
		
		System.out.println("O resultado da exponenciacao e: " + acumulador);
	}
}
