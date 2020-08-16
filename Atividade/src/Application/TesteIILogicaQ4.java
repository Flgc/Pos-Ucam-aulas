/**
Considerando um vetor A com 10 elementos inteiros,
 inicializado com os valores {1, 2, 3, 4, 5, 6, 7, 8, 9, 10} 
 e o trecho de programa:

Se o vetor A for impresso da posição 0 até a posição 9, 
após a finalização desta instrução for, quais valores seriam mostrados?
 */

package Application;

public class TesteIILogicaQ4 {

	public static void main(String[] args) {

		int i, x;
		int A[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
			for (i=0; i<A.length/2; i++) {
				x = A[i];
				A[i] = A[i+5];
				A[i+5] = x;
			}
			
			for (i=0; i<10; i++) {
				System.out.println("A["+i+"]="+A[i]);
			}
	}

}


