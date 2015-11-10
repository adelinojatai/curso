package curso;

public class Calcula {

	Double result = 0.0;
	
	public Double calcular(Double valueA, Double valueB, String operation){
		if(operation == "somar"){
			 result = valueA+valueB;
			 return result;
		}
		else if (operation == "diminuir"){
			result = valueA-valueB;
			return result;
		}
		else if (operation == "multiplicar"){
			result = valueA*valueB;
			return result;
		}
		else if (operation == "dividir"){
			result = valueA/valueB;
			return result;
		}
		else 
		System.out.println("A operação deve ter um dos valores a seguir: somar, diminuir, multiplicar ou dividir");	
		result = 0.0;
		return result;
		
	}
}
