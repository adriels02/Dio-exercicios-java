package exercicios_java;

import java.util.Scanner;

/*
 Tendo como dados de entrada a altura de uma pessoa, construa um programa em 
 Java que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) – 58.
*/

public class PesoIdeal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a sua altura. ");
		Double altura = leitor.nextDouble();
		
	    double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.println("O seu peso ideal e: " + pesoIdeal + " kg");		
	}
}
