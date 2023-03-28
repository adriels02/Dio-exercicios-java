package exercicios_java;

import java.util.Scanner;

/*
 
 Faça um programa em Java que leia do usuário a temperatura em graus Fahrenheit 
 e converta a temperatura para graus Celsius. Utilize a seguinte fórmula: C = (5 * (F-32) / 9).
 
 */

public class ConversorFahrenheitCelsius {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em graus Fahrenheit. ");
		double fahrenheit = leitor.nextDouble();
		
		double celsius = 5 * (fahrenheit - 32) / 9;
		
		System.out.println(fahrenheit + " graus Fahrenheit é equivalente a " + celsius + " graus Celsius");
		
		
	}
}
