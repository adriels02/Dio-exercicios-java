package exercicios_java;

import java.util.Scanner;

/*
 Um empresa resolveu dar um aumento de salário aos seus colaboradores e lhe contraram para desenvolver o programa 
 que calculará os reajustes. Faça um programa em Java que recebe o salário de um colaborador e reajuste-o segundo o 
 seguinte critério:
 
 salários até R$ 280,00 (incluindo) : aumento de 20%
 salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
 salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
 salários de R$ 1500,00 em diante : aumento de 5%
 
 Após o aumento ser realizado, informe na tela:
 
 o salário antes do reajuste;
 o percentual de aumento aplicado;
 o valor do aumento;
 o novo salário, após o aumento.

*/

public class ReajusteSalarial {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o salario do funcionario ");
		double salario = leitor.nextDouble();
		
		if (salario <= 280) {
			
			double salarioReajustado = salario + (salario * 0.2);
			double valorAumento = salario * 0.2;
			
			System.out.println("O seu salario sem o reajuste e: " + salario);
			System.out.println("O percentual do aumento e 20%. Sendo assim seu salario teve o valor de " + valorAumento + " aumentado.");
			System.out.println("O seu salario reajustado e: " + salarioReajustado);
		}
		
		if (salario > 280 && salario <= 700) {
			
			double salarioReajustado = salario + (salario * 0.15);
			double valorAumento = salario * 0.15;
			
			System.out.println("O seu salario sem o reajuste e: " + salario);
			System.out.println("O percentual do aumento e 15%. Sendo assim seu salario teve o valor de " + valorAumento + " aumentado.");
			System.out.println("O seu salario reajustado e: " + salarioReajustado);

			
		}
		
		if (salario > 700 && salario <= 1500) {
			
			double salarioReajustado = salario + (salario * 0.1);
			double valorAumento = salario * 0.1;
			
			System.out.println("O seu salario sem o reajuste e: " + salario);
			System.out.println("O percentual do aumento e 10%. Sendo assim seu salario teve o valor de " + valorAumento + " aumentado.");
			System.out.println("O seu salario reajustado e: " + salarioReajustado);

			
		}

		if (salario > 1500) {
	
			double salarioReajustado = salario + (salario * 0.05);
			double valorAumento = salario * 0.05;
			
			System.out.println("O seu salario sem o reajuste e: " + salario);
			System.out.println("O percentual do aumento e 5%. Sendo assim seu salario teve o valor de " + valorAumento + " aumentado.");
			System.out.println("O seu salario reajustado e: " + salarioReajustado);
	
		}		
	}
}
