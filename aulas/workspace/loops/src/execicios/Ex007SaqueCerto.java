package execicios;

public class Ex007SaqueCerto {
	public static void main(String[] args) {
		int notas[] = { 100, 50, 20, 10, 5, 2, 1 };
		int saque = 1233;

		for (int i = 0; i < notas.length; i++) {
		int r  = saque / notas[i];
		System.out.println("notas de:" + notas [i] + ":" + r);
		
		saque %= notas [i];

		
		
		
		
				
		
		
		
		
		
		System.out.println(saque);
		
			
		
		}

	}

}
