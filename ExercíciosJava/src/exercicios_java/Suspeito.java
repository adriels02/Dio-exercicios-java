package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que faça cinco perguntas para uma pessoa sobre um crime. No final o programa deve emitir 
 uma classificação sobre a participação da pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve 
 ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será 
 classificado como "Inocente". As perguntas são:
 
 Telefonou para a vítima?
 Esteve no local do crime?
 Mora perto da vítima?
 Devia para a vítima?
 Já trabalhou com a vítima?
 
 */

public class Suspeito {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		int contador = 0;

		System.out.print("Você telefonou para a vitima? ");
		boolean resposta1 = leitor.nextBoolean();

		if (resposta1 == true) {
			contador++;
		}

		System.out.print("Você esteve no local do crime? ");
		boolean resposta2 = leitor.nextBoolean();

		if (resposta2 == true) {
			contador++;
		}

		System.out.print("Você mora perto da vitima? ");
		boolean resposta3 = leitor.nextBoolean();

		if (resposta3 == true) {
			contador++;
		}

		System.out.print("Você devia para a vitima? ");
		boolean resposta4 = leitor.nextBoolean();

		if (resposta4 == true) {
			contador++;
		}

		System.out.print("Você ja trabalhou com a vitima? ");
		boolean resposta5 = leitor.nextBoolean();

		if (resposta5 == true) {
			contador++;
		}

		if (contador < 2) {
			System.out.println("Voce foi classificado como inocente.");
		}

		if (contador == 2) {
			System.out.println("Voce foi classificado como suspeito.");
		}

		if (contador == 3 || contador == 4) {
			System.out.println("Voce foi classificado como cumplice.");
		}

		if (contador == 5) {
			System.out.println("Voce foi classificado como assassino.");
		}
	}
}
