package Application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class StringSample_SearchAndOrdering_Sequantial_SearchBinary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		int a[] = new int[100];
		int i, key, midlle, left,right, pos=-1 ;
		
		Random generator = new Random(); 		//Generator random numbers in "generator"
		
		Scanner read = new Scanner(System.in);
		
		for (i=0; i<a.length; i++) {			//travels in all vector
			
			a[i] = generator.nextInt(100);		//Generating a vector random
			
			Arrays.sort(a);						//Sorts the vector in ascending order
		
			System.out.println("Imput a keys for serching: ");
			System.out.println(a[i]+" "); 		//Printing numbers of vector
			
			key = read.nextInt();
			
			left=0;right=99;
			
			while (left < right && pos==-1) { //travels in all vector
				
				midlle = (left+right)/2;
				
				if (a[midlle] == key) {				// is vector equal key

					pos = midlle;
				}
				
				else 
				
					if (key > a[midlle]){							//Arrived at the end of the vector
						
						left = midlle+1;
						
					}
				
					else {
						
						right = midlle-1;
					}
				
				if (pos >=0) {
					
					System.out.println("Element found in position: " + pos);
				}
					else {
						
						System.out.println("Element is not found in vector");
					}
			
			}
			
		read.close();
		break;
		}
	}

}
