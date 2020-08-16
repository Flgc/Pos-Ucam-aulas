package Application;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StringSample_SearchAndOrdering_Sequential_SearchArrays {

	public static void main(String[] args) {
	
		int a[] = new int[100];
		int i, key;
		
		Random generator = new Random(); 		//Generator random numbers in "generator"
		
		Scanner read = new Scanner(System.in);
		
		for (i=0; i<a.length; i++) {			//travels in all vector
			
			a[i] = generator.nextInt(100);		//Generating a vector random
			
			Arrays.sort(a);						//Sorts the vector in ascending order
		
			System.out.println("Imput a keys for serching: ");
			System.out.println(a[i]+" "); 		//Printing numbers of vector
			
			key = read.nextInt();
			
			i = 0;
			
			while (a[i] < key && i < a.length) { //travels in all vector
				
				i ++;
				
				if (a[i] == key) {				// is vector equal key
					
					System.out.println("Element found in position: " + a[i]);

				}
				else {							//Arrived at the end of the vector
				
					System.out.println("Element is not found in vector");
				
				}
			
			}
			
		read.close();
		break;
		}
	}

}
