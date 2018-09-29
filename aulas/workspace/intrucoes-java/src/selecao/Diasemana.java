package selecao;

import java.util.Random;

public class Diasemana {

	public static void main(String[] args) {

		int n = new Random().nextInt(7) + 1;

		System.out.println(n);

		switch (n) {
		case 1:
			System.out.println("impar");
			break;
		case 2:
			System.out.println("par");
			break;
		case 3:
			System.out.println("impar");
			break;
		case 4:
			System.out.println("par");
			break;
		case 5:
			System.out.println("inpar");
			break;
		case 6:
			System.out.println("par");
			break;
		case 7:
			System.out.println("inpar");
			break;
		default:

		}

	}

}
