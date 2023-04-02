package exercicios_java;

import java.util.Scanner;

/*
 Os ingressos de um cinema custam X reais. Na terça-feira há um desconto de 50% e em qualquer dia menores de 14 anos 
 também tem desconto de 50%. Os descontos são cumulativos. Faça um programa em Java que leia do usuário o dia da semana, 
 a idade do espectador e o preço base do ingresso e escreva o valor a pagar. Considere que 1 é domingo, 2 é segunda, etc. 
 */

public class Cinema {

	public static void main (String[] args) {
		
		Scanner leitor = new Scanner (System.in);
		
		System.out.print("Digite o dia da semana (1 e domingo, 2 e segunda etc) ");
		int diaSemana = leitor.nextInt();
			
		System.out.print("Digite o preco do ingresso ");
		double precoIngresso = leitor.nextDouble();
		
		System.out.print("Digite a idade do telespectador ");
		int idade = leitor.nextInt();
		
		if (diaSemana == 3) {
			precoIngresso = precoIngresso / 2;
		}
		
		if (idade < 14) {
			precoIngresso = precoIngresso / 2;
		}
		
		System.out.println("O valor do ingresso e: " + precoIngresso);
		
	}
}
