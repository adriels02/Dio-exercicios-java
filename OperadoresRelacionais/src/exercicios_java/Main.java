package exercicios_java;

public class Main {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro(null, null, 0);
		
		ferrari.setcor("Vermelha");
		ferrari.setmodelo("Ferrari braba");
		ferrari.setcapacidadeCombustivel(5.20);
		
		System.out.println(ferrari.getcor());
		System.out.println(ferrari.getmodelo());
		System.out.println(ferrari.getcapacidadeCombustivel());
		System.out.println(ferrari.calcularValor(40));
		
	}	
}
