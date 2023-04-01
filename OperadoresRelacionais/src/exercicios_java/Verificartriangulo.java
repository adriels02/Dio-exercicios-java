package exercicios_java;

import java.util.Scanner;

/*
 Faça um programa em Java que peça o tamanho dos três lados de um triângulo. O programa deverá informar se os lados 
 informados podem formar um triângulo. Caso os lados formem um triângulo o programa deve escrever se o mesmo é: 
 equilátero, isósceles ou escaleno. Algumas dicas:
 
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;

 */
public class Verificartriangulo {

	public static void main(String[] args) {
		
	Scanner leitor = new Scanner(System.in);
	
	System.out.print("Digite a medida do lado 1 ");
	double lado1 = leitor.nextDouble();
	
	System.out.print("Digite a medida do lado 2 ");
	double lado2 = leitor.nextDouble();
	
	System.out.print("Digite a medida do lado 3 ");
	double lado3 = leitor.nextDouble();
	
	
	if (lado1 + lado2 > lado3 && lado2 + lado3 > lado1 && lado1 + lado3 > lado2) {
		
		if (lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
			
			System.out.println("As medidas digitadas configuram um triangulo equilatero");
		}
		
		if (lado1 == lado2 || lado1 == lado3 || lado3 == lado2) {
			
			System.out.println("As medidas digitadas configuram um triangulo isosceles");
		}
		
		if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
			
			System.out.println("As medidas digitadas configuram um triangulo escaleno");
		}
		
		
	}
	else {
		System.out.println("As medidas digitadas nao configuram um objeto como triangulo");
	   }
	}
}
