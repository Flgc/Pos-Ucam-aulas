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

public class TesteIILogicaQ2 {

	public static void main(String[] args) {

		int c[] = new int[5], i, k, j;
		int a[] = {5,12,6,18,4};
		int b[] = {10,18,3,4,7};
		
			for (i=0, k=0; i<a.length; i++) {
				for (j=0; j<b.length; j++) {
					if (a[i] == b[j]) {
						c[k++] = a[i];
					}
				}
			}
			
			for (i=0; i<5; i++) {
				System.out.println("C["+i+"]="+c[i]);
			}
	}

}


