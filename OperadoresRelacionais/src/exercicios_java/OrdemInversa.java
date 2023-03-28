package exercicios_java;

import java.util.Scanner;
/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/

public class OrdemInversa {

	public static void main (String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int[] numerosInteiros = new int[6];
		
		for (int i = 0; i < 6; i++) {	
			System.out.println("Adicione um numero ao array");
			numerosInteiros[i] = scan.nextInt();	
		}		
		
		for (int i = numerosInteiros.length - 1; i >= 0; i--) {			
			System.out.println(numerosInteiros[i]);
		}	
	}
}
