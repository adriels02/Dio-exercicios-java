package exercicios_java;

import java.util.Scanner;
/*
 Faça um programa em Java que leia do usuário o número de cavalos de um haras e calcule quantas ferraduras devem ser compradas.
 
 */
public class Ferraduras {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de cavalos que existem no haras. ");
		int quantidadeCavalos = leitor.nextInt();
		
		System.out.println("A quantidade de ferraduras que se deve comprar é: " + quantidadeCavalos * 4);
		
	}
}
