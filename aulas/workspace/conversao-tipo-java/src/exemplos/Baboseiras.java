package exemplos;

import java.util.Scanner;

public class Baboseiras {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[][] matrizPalavras = { { "Bode", "Madeira", "Pia", "" }, { "", "N�o Pode", "Furado", "Mexe" },
				{ "na", "de", "com", "dentro" }, { "voc�", "eu", "n�s", "algu�m" } };
		String[][] usario = { {}, {}, {} };
		System.out.println(usario);

		String palavra1 = entrada.next();
		System.out.println(palavra1);
	}
}
