package exercicios;

public class Fatorial {
	public static void main(String[] args) {
		System.out.println(Fatorial.calcular(1 ));
	}

	public static int calcular(int i) {
		
		if (i == 1 ) {
		
		return 1 ;
		}
		return i * calcular( -- i);
	
	}
	
		
		
	}

		
		
	
	
		
	

