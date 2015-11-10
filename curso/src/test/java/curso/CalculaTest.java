package curso;



import org.junit.Test;


public class CalculaTest {

	@Test
	public void somar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(10.0, 20.0, "somar");
		System.out.println("O resultado da soma é: "+resultado);
		
	}
	
	@Test
	public void diminuir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(20.0, 10.0, "diminuir");
		System.out.println("O resultado da subtração é: "+resultado);
		
	}
	
	@Test
	public void multiplicar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(10.0, 20.0, "multiplicar");
		System.out.println("O resultado da multiplicação é: "+resultado);
		
	}
	
	@Test
	public void dividir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(2.0, 10.0, "dividir");
		System.out.println("O resultado da divisão é: "+resultado);
		
	}

}
