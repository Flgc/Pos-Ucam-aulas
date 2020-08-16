package Application;

import java.util.Locale;
import java.util.Random;

public class StringSample_SearchAndOrdering_Bubble_Sort {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a[] = new int [100];
		int i, j, aux;
		boolean exchange;
		
		Random generator = new Random(); //Generator random numbers in "generator" 
		
		System.out.println("Generated matrix: ");
		
		for (i=0; i<a.length; i++) { //travels in all matrix
			
			a[i] = generator.nextInt(100); //Generating a matrix random
			
			System.out.println(a[i]+" "); //Printing numbers of matrix
		}
		
		j=99;
		
		do {
		
			exchange = false;
			
			for (i=0; i<j; i++) {//travels in all matrix
				
				if (a[i] > a[i+1]) { // checks if the current matrix is smaller than the next matrix
					
					aux = a[i];					//change the position of the matrices
					a[i] = a[i+1];				//change the position of the matrices
					a[i+1]=aux;					//change the position of the matrices
					
					exchange = true;
				}
			}
			
			j --;		//Count down
			
		} while(exchange); // Will do while the exchange is true
		
		System.out.println("\nMatrix ordered: ");
		
		for (i=0; i<a.length; i++) {
			
			System.out.println(a[i]+" ");
		}
		
	}

}
