package curso;



import static org.junit.Assert.*;

import org.junit.Test;


public class CalculaTest {

	@Test
	public void somar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.somar(10.0, 20.0);
		System.out.println("O resultado da soma é: "+resultado);
		//assertEquals(30.0, resultado);
		
	}
	
	@Test
	public void diminuir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.subtrair(20.0, 10.0);
		System.out.println("O resultado da subtração é: "+resultado);
		
	}
	
	@Test
	public void multiplicar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.multiplicar(10.0, 20.0);
		System.out.println("O resultado da multiplicação é: "+resultado);
		
	}
	
	@Test
	public void dividir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.dividir(20.0, 10.0);
		System.out.println("O resultado da divisão é: "+resultado);
		
	}

}
