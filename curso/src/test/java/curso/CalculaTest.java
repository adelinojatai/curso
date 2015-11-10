package curso;



import org.junit.Test;


public class CalculaTest {

	@Test
	public void somar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(10.0, 20.0, "somar");
		System.out.println("O resultado da soma �: "+resultado);
		
	}
	
	@Test
	public void diminuir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(20.0, 10.0, "diminuir");
		System.out.println("O resultado da subtra��o �: "+resultado);
		
	}
	
	@Test
	public void multiplicar() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(10.0, 20.0, "multiplicar");
		System.out.println("O resultado da multiplica��o �: "+resultado);
		
	}
	
	@Test
	public void dividir() {
		Double resultado;
		Calcula calcula = new Calcula();
		resultado = calcula.calcular(2.0, 10.0, "dividir");
		System.out.println("O resultado da divis�o �: "+resultado);
		
	}

}
