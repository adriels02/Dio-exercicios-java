package exercicios_java;

import java.util.Scanner;

/*
 A partir do saldo bancário inicial, um cliente teve débitos e créditos ao longo do mês. 
 Faça um programa em Java que leia o saldo inicial, o total de débitos e o total de créditos e 
 depois escreva o saldo final do cliente através de uma dessas três mensagens: “Saldo positivo em R$ X”,  
 “Saldo negativo em R$ X” ou “Saldo Zero”.
 */

public class ContaBancaria {

	public static void main (String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o saldo bancario inicial ");
		double saldoInicial = leitor.nextDouble();
		
		System.out.print("Digite o quanto foi gasto. ");
		double debitos = leitor.nextDouble();
		
		System.out.print("Digite o quanto foi adicionado. ");
		double creditos = leitor.nextDouble();
		
		double balanco = saldoInicial + (creditos - debitos);
		
		if (balanco > 0) {
			
			System.out.println("Saldo positivo em R$ " + balanco);
		}
		
		if (balanco == 0) {
			
			System.out.println("Saldo zero");
		}
		
		if (balanco < 0) {
			
			System.out.println("Saldo negativo em R$ " + balanco);
		}		
	}
}
