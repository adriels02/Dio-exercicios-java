package exercicios_java;

public class Carro {

	String cor;
	String modelo;
	double capacidadeCombustivel;
	
	
	
	Carro(String cor, String modelo,double capacidadeCombustivel){

		this.capacidadeCombustivel = capacidadeCombustivel;
		this.modelo = modelo;
		this.cor = cor;
	}
		
    void setcor(String cor) {
    	this.cor = cor;
    }
   
	String getcor() {
		return cor;
	}
	
	void setmodelo(String modelo) {
		this.modelo = modelo;
	}
	
	String getmodelo() {
		return modelo;
	}
	
	void setcapacidadeCombustivel(double capacidadeCombustivel) {
		this.capacidadeCombustivel = capacidadeCombustivel;
	}
	
	double getcapacidadeCombustivel() {
		return capacidadeCombustivel;
	}
	
	 public double calcularValor(double precoCombustivel) {
		 
		 return precoCombustivel * capacidadeCombustivel;
		 
	 }	
	 
	 
}


