
package incrementodecremento;

public class Decremento {
	public static void main(String[] args) {
		int x = 10;
		x--;
		
		System.out.println("O valor de x � " + x );
		int  y = x--;
		
		System.out.println("O valor de y � " + y );
		
		int z = --x;
		
		System.out.println("O valor de z � " + z);
		System.out.println("O valor de x � " + x);
		
		int soma = 1 + --x;
		
		System.out.println(soma);
}
}
