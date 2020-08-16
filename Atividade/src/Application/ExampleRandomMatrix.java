package Application;

import java.util.Random;

public class ExampleRandomMatrix {

	public static void main(String[] args) {
		
		int a[][] = new int [5][5];
		int l,c, sum;
		Random generator = new Random();
		
		System.out.println("Generating random matrix elements...");
		
		for (l=0; l<5; l++) {
			for (c=0; c<5; c++) {
				//(10)+10 Gera número de zero a 9 + 10 = 19
				a[l][c] = generator.nextInt(10)+10; 
			}
		}
		
		for(l=0; l<5; l++ ) {
			sum = 0;
			for (c=0; c<5; c++) {
				sum += a[l][c];
				System.out.println("Line sum " + l + " = " + sum);
			}
		}
	}

}
