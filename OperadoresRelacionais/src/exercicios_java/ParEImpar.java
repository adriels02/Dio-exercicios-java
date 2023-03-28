package exercicios_java;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class ParEImpar {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int quantidadePares = 0;
		int quantidadeImpares= 0;
		int numeros;
		int quantidadeNumeros;
		
		System.out.println("Informe quantos numeros inteiros que deseja analisar.");
		quantidadeNumeros = scan.nextInt();
				
		for (int i = 0; i < quantidadeNumeros; i++) {
			
			System.out.println("Digite um numero.");
			numeros = scan.nextInt();
			
			if (numeros % 2 == 0) {
				quantidadePares++;
			}
			else {
				quantidadeImpares++;
			}
		}				
        System.out.println("A quantidade de numeros pares e: " + quantidadePares);
        System.out.println("A quantidade de numeros impares e: " + quantidadeImpares);            
        }
	}

