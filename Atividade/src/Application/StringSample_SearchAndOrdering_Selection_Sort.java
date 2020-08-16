package Application;

import java.util.Locale;
import java.util.Random;

public class StringSample_SearchAndOrdering_Selection_Sort {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a[] = new int [100];
		int i, j, minor, minorPosition;
		
		Random generator = new Random(); //Generator random numbers in "generator" 
		
		System.out.println("Generated matrix: ");
		
		for (i=0; i<a.length; i++) { //travels in all matrix
			
			a[i] = generator.nextInt(100); //Generating a matrix random
			
			System.out.println(a[i]+" "); //Printing numbers of matrix
		}
		
		for (i=0; i<a.length; i++) {//travels in all matrix
			
			minor = a[i];
			minorPosition = i;
			
			for (j=i+1; j<a.length; j++) {//Next position sum one and travels in all matrix
				
				if (a[j] < minor) { // If current position is minor value in matrix
					
					minor = a[j];		//Guard the matrix value 
					minorPosition = j;	//Minor current position
				}
			}
			
			a[minorPosition] = a[i]; //Guard the matrix minor position 
			a[i] = minor;			 //Guard the matrix minor
		}
		
		System.out.println("\nMatrix ordered: ");
		
		for (i=0; i<a.length; i++) {
			
			System.out.println(a[i]+" ");
		}
		
	}

}
