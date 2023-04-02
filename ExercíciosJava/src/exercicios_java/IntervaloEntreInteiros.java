package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que leia dois números inteiros e escreva os números inteiros que estão no 
 intervalo compreendido entre eles.
 */
public class IntervaloEntreInteiros {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero inteiro ");
		int numero1 = leitor.nextInt();
		
		System.out.println("Digite o segundo numero inteiro ");
		int numero2 = leitor.nextInt();
		
		for (var i = numero1 + 1; i < numero2; i++) {
			
			System.out.print(i + " ");
		}		
	}
}
