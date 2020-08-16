package Application;

import java.util.Random;

public class ExampleRandomVector {

	public static void main(String[] args) {
		
		int a[] = new int[5], i;
		
		Random generator = new Random();
		
		System.out.println("Generating random element in vector: ");
		
		for(i=0; i<5; i++) {
			a[i] = generator.nextInt(100);			
		}
		
		System.out.println("Genereted vector ");
		
		for (i=0; i<5; i++) {
			System.out.println("A["+i+"]="+a[i]);
		}

	}

}



//package Aplication;
//
//import java.util.Random;
//
//public class ExampleRandomVector {
//
//	public static void main(String[] args) {
//		
//		int a[] = new int[10], i;
//		
//		Random generator = new Random();
//		
//		System.out.println("Generating random element in vector: ");
//		
//		for(i=0; i<a.length; i++) {
//			a[i] = generator.nextInt(10)+10;			
//		}
//		
//		System.out.println("Genereted vector ");
//		
//		for (i=a.length-1; i>=0; i--) {
//			System.out.println("A["+i+"]="+a[i]);
//		}
//
//	}
//
//}

