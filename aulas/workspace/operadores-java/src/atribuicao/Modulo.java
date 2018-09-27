package atribuicao;

public class Modulo {

	public static void main(String[] args) {
		int primeiroNumero = 10;
		int segundoNumero =5;
		
		System.out.println("Primeiro numero: " + primeiroNumero);
		System.out.println("Segundo numero: " + segundoNumero);
		
		primeiroNumero = segundoNumero;
		System.out.println("Segundo numero: " + segundoNumero);
	}

}
