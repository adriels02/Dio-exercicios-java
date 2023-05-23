package exercicios_java;

public class PosicaoAoQuadrado {

	public static void main(String[] args) {

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {

			array[i] = i * i;
		}

		System.out.println("As posicoes do array ao quadrado sao: ");

		for (int i = 0; i < array.length; i++) {

			if (i >= 0 && i < 18) {
			System.out.print(array[i] + " , ");
			}
			
			else {
				System.out.print(array[i] + ".");
			}
		}
	}
}
