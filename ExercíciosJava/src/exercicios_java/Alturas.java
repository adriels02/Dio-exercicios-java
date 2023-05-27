package exercicios_java;

import java.util.Scanner;

// Crie um array que leia a altura de uma quantidade X de pessoas e depois informe a média da altura.

public class Alturas {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		System.out.print("Informe quantas pessoas terao sua altura lida ");
		int pessoas = leitor.nextInt();
		double media = 0;
		double[] alturas = new double[pessoas];

		for (int i = 0; i < alturas.length; i++) {

			System.out.println("Digite a altura da pessoa " + (1 + i));
			double altura = leitor.nextDouble();

			alturas[i] = altura;

		}

		for (int i = 0; i < alturas.length; i++) {

			media += alturas[i];
			if (i == alturas.length - 1) {

				media = media / pessoas;
			}

		}
		
		System.out.printf("%s %.2f" ,"A altura media das alturas das pessoas analisadas e: " , media);

		leitor.close();

	}
}
