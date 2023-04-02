package exercicios_java;

import java.util.Scanner;
/*
Faça um programa em Java que leia do usuário um valor em metros e converta para centímetros.
*/

public class ConversorMetrosParaCentimetros {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de metros. ");
		double metros = leitor.nextDouble();
		
		System.out.println("A conversão de " + metros + " metros para centimetros e : " + metros * 100 + " Centimetros.");
		
		
	}
}
