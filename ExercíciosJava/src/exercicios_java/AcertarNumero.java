package exercicios_java;

import java.util.Scanner;

//Faça um algoritmo para que o um usuário tente acertar um número informado por outro usuário. 
//Inicialmente um usuário fornece um número para o algoritmo, depois o outro usuário deve informar números ao 
//algoritmo até acertar (obviamente o segundo usuário não deve ver o número informado pelo primeiro).  Para ajudar, 
//a cada tentativa o computador deve exibir as seguintes mensagens: “Seu número é maior do que o meu” ou 
//“Seu número é menor do que o meu”. Ao acertar imprima quantas tentativa foram necessárias.

public class AcertarNumero {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o numero que o usuaria ira precisar achar ");
		int objetivo = leitor.nextInt();
		int tentativas = 0;
		
		
		for (;;) {
			
			System.out.println("digite um numero e tente acertar qual foi o escolhido");
			int numero = leitor.nextInt();
			tentativas++;
			
			if (numero == objetivo) {
				
				System.out.println("Parabens, voce acertou o numero escolhido. A quantidade de tentativas foram: " + tentativas);
				break;
			}
			
			if (numero < objetivo) {
							
				System.out.println("Seu número e menor do que o meu");
				
			}
			
			if (numero > objetivo) {
				
				System.out.println("Seu número e maior do que o meu");
				
			}
			
			
			
			
			
			
		}
		
		
		
	}
}
