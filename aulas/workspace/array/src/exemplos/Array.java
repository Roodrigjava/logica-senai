package exemplos;

import java.util.Arrays;

public class Array {
	public static void main(String[] args) {
			
		double precos [] = new double[5];
		
		String eumeam[] = {" no ","seu", "coração" };
		
		double[] salarios = new double[6];
		
		int[] numeros = {1,2,3,4};
		
		System.out.println(Arrays.toString(eumeam));
		
		System.out.println(numeros[2]);
		
		System.out.println(Arrays.toString(salarios));
		
		salarios[2] = 1020.40;
		System.out.println(Arrays.toString(salarios));
		
		
	}
}
