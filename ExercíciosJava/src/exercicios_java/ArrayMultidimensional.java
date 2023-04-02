package exercicios_java;

import java.util.Random;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/
public class ArrayMultidimensional {

	public static void main (String[] args) {
		
		Random random = new Random();
		int[][] matriz = new int[4][4];
		
		for (int i = 0; i < 4; i++) {
			
			int linha = random.nextInt(9);
						
			for(int j = 0; j < 4; j++) {
				
				int coluna = random.nextInt(9);
				
				matriz[i][j] = matriz[linha][coluna];
			}			
		}
		
		for (int i = 0; i < 4 ; i++) {
			System.out.println(matriz[i]);
		}
		
		
	}
}
