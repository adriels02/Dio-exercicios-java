package exercicios_java;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:

5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int operando1;
		int produto;

		for (;;) {

			System.out.println("Informe um numero entre 1 e 10 para sua tabuada ser exibida");
			operando1 = scan.nextInt();

			if (operando1 >= 1 && operando1 <= 10) {
				break;
			}
		}

		for (int i = 1; i <= 10; i++) {

			produto = operando1 * i;

			System.out.println(operando1 + " X " + i + " = " + produto);

		}

	}
}
