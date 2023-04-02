package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido 
 e continue pedindo até que o usuário informe um valor válido.

 */
public class Nota0a10 {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		for (;;) {
			
			System.out.print("Digite a nota entre 0 e 10 ");
			double nota = leitor.nextDouble();
			
			if (nota >= 0 && nota <= 10) {
				
				System.out.println("A nota do aluno e: " + nota);
				break;
			}
			
			else {
				System.out.println("A nota digitada: " + nota +" e invalida.");
			}
			
			
			
			
		}
		
		
		
		
	}
}
