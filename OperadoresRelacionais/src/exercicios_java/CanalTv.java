package exercicios_java;

import java.util.Scanner;

/*
 
 Faça um algoritmo que leia o número de um canal de televisão e escreva o nome da emissora
correspondente. Caso o usuário forneça um canal sem emissora exibir a mensagem “Canal inválido”.
Considere as seguintes emissoras e seus respectivos canais: 2=SBT, 4=BAND, 6=RedeTV!, 9=Record,
13=Globo.

 */

public class CanalTv {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o numero de um canal de TV. ");
		int canal = leitor.nextInt();
		
		switch (canal) {
		case 2: {
			
			System.out.println("Voce esta no SBT...");
			
			break;
		}
		
		case 4: {
			
			
			System.out.println("voce esta na Band");
			
			break;
		}
		
		case 6: {
			
			System.out.println("voce esta na RedeTV");
			break;
		}
		
		case 9: {
			
			System.out.println("voce esta na Record");
			break;
		}
		case 13: {
			System.out.println("voce esta na Globo");
			break;
		}		
		default:
			System.out.println("Canal invalido");
		}	
	}
}
