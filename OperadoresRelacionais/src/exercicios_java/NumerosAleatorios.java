package exercicios_java;

import java.util.Random;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

public class NumerosAleatorios {

	public static void main (String[] args) {
		
		Random random = new Random();
		
		int[] array = new int[20];
		
		
		for (int i = 0; i < 20; i++) {
			
			int numero = random.nextInt(100);
			array[i] = numero;
		}
		
		System.out.println("Os numeros gerados foram: ");
		for (int i = 0; i < 20; i++) {
			
			System.out.print(array[i] + " ");
			
			if (i == array.length - 1) {
				System.out.println(" ");
			}
		}	
		
		System.out.println("Seus antecessores sao: ");
		for (int i = 0; i < 20; i++) {
			
			System.out.print(array[i] - 1 + " ");
			
			if (i == array.length - 1) {
				System.out.println(" ");
			}
		}
		
		System.out.println("Seus sucessores sao: ");
		for (int i = 0; i < 20; i++) {
			
			System.out.print(array[i] + 1 + " ");
		}		
	}
}

