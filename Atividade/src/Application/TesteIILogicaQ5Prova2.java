/**
 * Considerando que os vetores a, b e c foram 
 * devidamente declarados e alocados com 5 elementos 
 * cada e que as demais variáveis também estão 
 * declaradas, e, considerando, ainda, que o vetor a 
 * contém [ 5, 12, 6, 18, 4] e que o vetor b 
 * contém [ 10, 18, 3, 4 , 7], analise o trecho
 *  de programa abaixo e responda: quais valores 
 *  estarão no vetor c ?
 */

package Application;

public class TesteIILogicaQ5Prova2 {

	public static void main(String[] args) {

		int v[] = { 2, 4, 6, 8, 10, 12 };

		int l;

		for (l = 1; l < v.length; l += 2) {
			System.out.print(" " + v[l]);
		}
	}

}

//package Aplication;
//
//public class ExampleMatrix2 {
//
//	public static void main(String[] args) {
//		int a [][] = {{5,5,5,5},
//				{4,4,4,4},
//				{3,3,3,3},
//				{2,2,2,2},
//				{1,1,1,1} 
//				};
//				int l,c;
//
//		System.out.println("Generated Matrix:");
//		for (l=0; l<5; l++){
//			for (c=0; c<4; c++) {
//				System.out.print(a[l][c]+"");
//				System.out.println();
//			}
//		}
//		
//	}
//
//}