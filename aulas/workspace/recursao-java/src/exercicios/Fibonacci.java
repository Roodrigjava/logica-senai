package exercicios;

public class Fibonacci {
	public static void main(String[] args) {
		
		System.out.println(Fibonacci.somar(9));
		}
		
		public static int somar(int n) {
			
			if (n == 1) {
				
			
				return 1;
			}else {
				
				return n + somar ( n - 1);
	}
}
}
