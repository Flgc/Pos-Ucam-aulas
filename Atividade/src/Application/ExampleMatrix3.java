package Application;

import java.util.Scanner;

public class ExampleMatrix3 {

	public static void main(String[] args) {
		
		int a[][] = new int [5][5];
		int l, c;
		Scanner ler = new Scanner(System.in);

		System.out.println("Type the 5 x 5 matrix elements: ");
		for (l=0; l<5; l++){
			for (c=0; c<5; c++) {
				a[l][c] = ler.nextInt();
		   	}
		}
		
		System.out.println("Main diagonal: ");
		for (l=0; l<5; l++){
			System.out.println( a[l][l]) ;// on the main diagonal rows and columns are the same
		}
	}
}