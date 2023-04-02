package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java calcule a área de um quadrado, em seguida escreva o dobro desta área.
*/

public class AreaQuadrado {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);		
		
		System.out.print("Digite a medida e 1 dos lados do quadrado. ");
		double ladoQuadrado = leitor.nextDouble();
		
		System.out.println("O dobro da area do quadrado informado e: " + (ladoQuadrado * ladoQuadrado) * 2);
	}
}
