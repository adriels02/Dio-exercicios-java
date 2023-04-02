package exercicios_java;

import java.util.Scanner;

//  Faça um algortimo que calcule e exiba a nota de um aluno em uma prova de 10 questões. Para calcular a nota do 
//	aluno deve-se ler do usuário a resposta de cada uma das 10 questões e comparar com o gabarito abaixo.
//
//	01 - A
//	02 – B
//	03 - C
//	04 - D
//	05 - E
//	06 - E
//	07 - D
//	08 - C
//	09 - B
//	10 - A

public class Gabarito {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		int nota = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.println("Digite a letra da sua resposta da questao " + i + " ");
			String letra = leitor.nextLine();
			
			if (i == 1 && letra.equals("A")) {
				
				nota++;
			}
			
			if (i == 2 && letra.equals("B")) {
				
				nota++;
			}
		
			if (i == 3 && letra.equals("C")) {
				
				nota++;
			}
			
			if (i == 4 && letra.equals("D")) {
	
				nota++;
			}
			
			if (i == 5 && letra.equals("E")) {
	
				nota++;
			}
			
			if (i == 6 && letra.equals("E")) {
	
				nota++;
			}
			
			if (i == 7 && letra.equals("D")) {
	
				nota++;
			}	
			
			if (i == 8 && letra.equals("C")) {
	
				nota++;
			}
			
			if (i == 9 && letra.equals("B")) {
	
				nota++;
			}	
			
			if (i == 10 && letra.equals("A")) {
	
				nota++;
			}	
			
			
		}
		
		System.out.println("Sua nota e: " + nota);		
	}
}
