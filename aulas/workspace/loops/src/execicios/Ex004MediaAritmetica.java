package execicios;

import java.util.Arrays;

public class Ex004MediaAritmetica {

	public static void main(String[] args) {
		// Determinar as notas
		double notas[] = { 5.5, 4.5, 3.5, 8.5 };

		// Variavel com a somatoria das notas
		double a = 0;
		double media = 0;

		// Iterar por todas as notas
		for (int i = 0; i < notas.length; i++) {
			a += notas[i];
			
		}
		media = a / notas.length;
		
		if (media >= 5) {
			System.out.println("Passou Trouxa");
		} else {
			System.out.println("Errou");
		}
		System.out.println("Media " + media);

	}
}
