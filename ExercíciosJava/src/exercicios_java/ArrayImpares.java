package exercicios_java;

import java.util.Scanner;

//Faça um programa em Java que leia 30 números em um array e imprima os números localizados nas posições ímpares do array.

public class ArrayImpares {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] array = new int[30];
		
		for (int i = 0; i < array.length;i++) {
			
			System.out.print("Digite um numero para o array ");
			array[i] = leitor.nextInt();
					
		}
		
		System.out.println("Os numeros digitados nas posicoes impares sao: " );
		
		for (int i = 0; i < array.length; i++) {
			
			if (i % 2 != 0) {
				
				System.out.print(array[i] + " , " );
			}			
		}		
	}
}
