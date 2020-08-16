/**
 * Um vetor é dito simétrico se os elementos estão 
 * “espelhados” do centro para as extremidades. 
 * Veja o exemplo, o vetor A possui 10 elementos e é simétrico,
 *  pois: A[4] == A[5], A[3] == A[6], A[2] == A[7] ... :
 * 
 *  a[] = {1,2,3,4,5,5,4,3,2,1}
 *  
 *  Analise os trechos de programas abaixo e assinale aquele que 
 *  apresenta a solução para este problema 
 * 
 */

// LETRA I - eRRO DE EXPTION
//package Aplication;
//
//public class TesteIILogicaQ2Prova2 {
//
//	public static void main(String[] args) {
//
//		int a[] = {1,2,3,4,5,5,4,3,2,1};
//		boolean sim;
//		int i, tam;
//
//		for (i=0, sim=true, tam=a.length; sim == true && i <tam/2; i++) {
//			if (a[i] != a[tam -i]) {
//				sim = false;
//			}
//		}
//
//		if (sim) {
//			System.out.println("vetor é Simétrico!");
//		} else {
//			System.out.println("não é Simétrico!");
//		}
//	}
//
//}


// LETRA II - não é Simétrico!
//package Aplication;
//
//public class TesteIILogicaQ2Prova2 {
//
//	public static void main(String[] args) {
//
//		int a[] = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
//		boolean sim;
//		int i, tam;
//
//		for (i = 0, sim = true, tam = a.length; sim == true && i < tam; i++, tam--) {
//			if (a[i] != a[tam - 1 - i]) {
//				sim = false;
//			}
//		}
//
//		if (sim) {
//			System.out.println("vetor é Simétrico!");
//		} else {
//			System.out.println("não é Simétrico!");
//		}
//	}
//
//}


// LETRA III - não é Simétrico!
//package Aplication;
//
//public class TesteIILogicaQ2Prova2 {
//
//	public static void main(String[] args) {
//
//		int a[] = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
//		boolean sim;
//		int i, tam;
//
//		for (i = 0, sim = false, tam = a.length; sim == false && i < tam/2; i++) {
//			if (a[i] != a[tam - 1 - i]) {
//				sim = true;
//			}
//		}
//
//		if (sim) {
//			System.out.println("vetor é Simétrico!");
//		} else {
//			System.out.println("não é Simétrico!");
//		}
//	}
//
//}

// LETRA IV - é Simétrico!
package Application;

public class TesteIILogicaQ2Prova2 {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1 };
		boolean sim;
		int i, tam;

		for (i = 0, sim = true, tam = a.length; sim == true && i < tam/2; i++) {
			if (a[i] != a[tam - 1 - i]) {
				sim = false;
			}
		}

		if (sim) {
			System.out.println("vetor é Simétrico!");
		} else {
			System.out.println("não é Simétrico!");
		}
	}

}