package Application;

import java.util.Locale;
import java.util.Random;

public class StringSample_SearchAndOrdening_Direct_Insert_Sort {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a[] = new int[100];
		int i, j, aux;
		Random genarator = new Random(); //Generator random numbers in "generator" 
		
		System.out.println("Generated matrix: ");
		
		for (i=0; i<a.length; i++) { //travels in all matrix
			
			a[i] = genarator.nextInt(100); //Generating a matrix random
			
			System.out.println(a[i]+" "); //Printing numbers of matrix
		}
		
		for (i=1; i<a.length; i++) { //travels in all matrix
			
			aux = a[i];				//save current matrix
			j = i-1;				//save the preevious position
			
			while ((j>0) && (aux<a[j])) { //As long as it is possible to change the position
				
				a[j+1] = a[j];			//Elements in moves
				j--;
			}
			
			a[j+1] = aux;	//Inserting matrix in correct position
		}
		
		System.out.println("\nMatrix ordered: ");
		
		for (i=0; i<a.length; i++) {
			
			System.out.println(a[i]+" ");
		}
	}

}
