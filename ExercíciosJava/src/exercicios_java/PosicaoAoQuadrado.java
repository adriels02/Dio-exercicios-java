package exercicios_java;

import java.util.Scanner;

//Faça um programa em Java que gere um array de 20 posições, onde cada elemento do array corresponde ao 
//quadrado da sua posição. Imprima o array resultante.

public class PosicaoAoQuadrado {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int[] array = new int[20];
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = i * i;			
		}
		
		System.out.println("As posicoes do array ao quadrado sao: ");
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.print(array[i] + " , ");		
		}		
	}
}
