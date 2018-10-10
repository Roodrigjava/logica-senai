
public class CalculosPraVc {
	public static void main(String[] args) {
		// mostra com retun e sem return
		// Invocação
		System.out.println(CalculosPraVc.soma(2.0, 4.0));
		//forma de invocar o metodo e imprimir 
		System.out.println(CalculosPraVc.divisao(2.0, 4.0));
		
		//Igual o de cima mais guarda o resultado numa variavel  
		Double resultado = CalculosPraVc.multiplicacao(2.0, 4.0);
		System.out.println(resultado);
		
		//Invocando sem return
		CalculosPraVc.subitracao(50, 2);
	}

	// declaração
	public static double soma (double num1, double num2) {
		return num1 + num2;
	}

	public static double divisao (double num1, double num2) {
		return num1 / num2;

	}

	public static double multiplicacao (double num1, double num2) {
		return num1 * num2;
	}

	public static void subitracao (double num1, double num2) {
		System.out.println( " Subitração " + (num1 - num2));
	}

}