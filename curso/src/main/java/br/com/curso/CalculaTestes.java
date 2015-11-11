package br.com.curso;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculaTestes {

	Double result;
	Calcula calcula;
	
	@Test
	public void testSomar() {
		 calcula = new Calcula();
		result = calcula.somar(20.0, 10.0);
		
		assertEquals(Double.valueOf(30.0), result);
	}

	@Test
	public void testSubtrair() {
		calcula = new Calcula();
		result = calcula.subtrair(20.0, 10.0);
		
		assertEquals(Double.valueOf(10.0), result);
	}

	@Test
	public void testMultiplicar() {
		calcula = new Calcula();
		result = calcula.multiplicar(2.0, 10.0);
		
		assertEquals(Double.valueOf(20.0), result);
	}

	@Test
	public void testDividir() {
		calcula = new Calcula();
		result = calcula.dividir(20.0, 10.0);
		
		assertEquals(Double.valueOf(2.0), result);
	}

}
