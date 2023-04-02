package exercicios_java;

import java.util.Scanner;

/*
 * 
 Faça um programa em Java que leia do usuário quanto ele ganha por hora e o 
 número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.
 
 */

public class SalarioMensal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o quanto voce ganha por hora trabalhada: ");
		double remuneracaoHora = leitor.nextDouble();
		
		System.out.print("Digite a quantidade de horas trabalhadas no mes: ");
		int horaTrabalhada = leitor.nextInt();
		
		System.out.println("A quantidade ganha por " + horaTrabalhada + " horas e: " + remuneracaoHora * horaTrabalhada + " R$");
	}
}
