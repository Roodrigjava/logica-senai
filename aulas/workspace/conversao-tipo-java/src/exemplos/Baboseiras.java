package exemplos;

import java.util.Scanner;

public class Baboseiras {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[][] matrizPalavras = { { "Bode", "Madeira", "Pia", "" }, { "", "Não Pode", "Furado", "Mexe" },
				{ "na", "de", "com", "dentro" }, { "você", "eu", "nós", "alguém" } };
		String[][] usario = { {}, {}, {} };
		System.out.println(usario);

		String palavra1;
		String[] palavra2;
		System.out.printf("Informe uma palavra simples:\n");

		palavra1 = entrada.next();
		System.out.println(palavra1);
	}
}
