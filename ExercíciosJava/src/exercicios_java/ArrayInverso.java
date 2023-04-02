package exercicios_java;

import java.util.Scanner;

//Faça um programa em Java que leia um array de 10 números reais e mostre-os na ordem inversa.

public class ArrayInverso {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		double [] numerosReais = new double[10];
		
		for (int i = 0 ; i < numerosReais.length; i++) {
			
			System.out.print("Digite um numero para o array ");
			numerosReais[i] = leitor.nextDouble();					
		}
		
		System.out.println("O array digitado na ordem inversa e: ");
		for (int i = numerosReais.length - 1; i >= 0; i--) {
			
			System.out.print(numerosReais[i] + " , ");			
		}		
	}
}
