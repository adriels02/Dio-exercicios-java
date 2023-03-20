package exercicios_estruturas_de_repeticao;

import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Fatorial {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int numero;
		int fatorial = 1;
		
		System.out.println("Digite um numero inteiro");
		numero = scan.nextInt();
		
		if (numero == 0){
			
			fatorial = 0;
		}
		
		for (int i = 1; i <= numero; i++) {
			
			fatorial = fatorial *= i;
			
			
		}
		
		System.out.println(numero +"!= " + fatorial);
		
	}
	
	
	
	
	
}
