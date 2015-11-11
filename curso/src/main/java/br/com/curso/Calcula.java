package br.com.curso;



public class Calcula {
	Double result = 0.0;
		
	public Double somar(Double valueA, Double valueB){
		result = valueA + valueB;
		return result;
	}
	
	public Double subtrair(Double valueA, Double valueB){
		result = valueA - valueB;
		return result;
	}
	
	public Double multiplicar(Double valueA, Double valueB){
		result = valueA * valueB;
		return result;
	}
	
	public Double dividir(Double valueA, Double valueB){
		result = valueA / valueB;
		return result;
	}
	
	
}
