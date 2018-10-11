package exercicios;

public class OrelhaDeGato {
	public static void main(String[] args) {
		System.out.println(OrelhaDeGato.calcula(3));
	}

	private static int calcula(int g1) {
		
		if (g1 == 0) {
		
			return 0;
		}else {
			return g1 + calcula(g1 - 1);
		}
	
	}
}
