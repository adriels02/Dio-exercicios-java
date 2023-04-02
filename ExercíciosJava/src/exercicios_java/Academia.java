package exercicios_java;

import java.util.Scanner;

/*
 Uma academia deseja fazer um senso entre seus clientes para descobrir o mais alto, o mais baixo, a mais
gordo e o mais magro, para isto você deve fazer um programa em Java que pergunte a cada um dos clientes da 
academia seu código, sua altura e seu peso. O final da digitação de dados deve ser dada quando o usuário 
digitar 0 (zero) no campo código. Ao encerrar o programa também deve ser informados os códigos e valores do 
clente mais alto, do mais baixo, do mais gordo e do mais magro, além da média das alturas e dos pesos dos clientes.
 */

public class Academia {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);

		double alturaMaior = 0;
		double alturaMenor = Double.MAX_VALUE;
		double pesoMaior = 0;
		double pesoMenor = Double.MAX_VALUE;
		
		for (;;) {
			
			System.out.print("Digite seu codigo ");
			int id = leitor.nextInt();
			
			if (id == 0) {
				break;
			}
			
			System.out.print("Digite seu peso em kg");
			double peso = leitor.nextDouble();
			
			System.out.println("Digite sua altura em metros");
			double altura = leitor.nextDouble();
			
			
			if (alturaMaior < altura) {				
				alturaMaior = altura;				
			}
			
			if (alturaMenor > altura) {
				alturaMenor = altura;
			}
			
			if (pesoMaior < peso) {
				pesoMaior = peso;
			}
			
			if (pesoMenor > peso) {
				pesoMenor = peso;
			}
		}
		
		System.out.println("A altura maior e: " + alturaMaior);
		System.out.println("A altura menor e: " + alturaMenor);
		System.out.println("O peso maior e: " + pesoMaior);
		System.out.println("O peso menor e: " + pesoMenor);
		
	}
}
