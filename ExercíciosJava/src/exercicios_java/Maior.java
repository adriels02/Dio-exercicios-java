package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que leia três números e mostre o maior deles.
 
 */
public class Maior {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite um numero ");
		double numero1 = leitor.nextDouble();
		
		System.out.print("Digite um numero ");
		double numero2 = leitor.nextDouble();
		
		System.out.print("Digite um numero ");
		double numero3 = leitor.nextDouble();
		
		if (numero1 > numero2) {
			numero2 = numero1;
		}
		
		if (numero2 > numero3) {
			numero3 = numero2;
		}
		
		System.out.println("O maior numero digitado e: " + numero3);
		
	}
}
