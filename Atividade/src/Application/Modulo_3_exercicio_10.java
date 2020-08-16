/**
 * 
 */

package Application;

import java.util.Random;

public class Modulo_3_exercicio_10 {

	public static void main(String[] args) {

		int a[][] = new int[5][5];
		boolean simetria = true;
		int i, j;

		Random gerador = new Random();
		System.out.println("Gerando elementos aleatorios da matriz...");

		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				a[i][j] = gerador.nextInt(10) + 10;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		// verificando se a matriz A é simétrica
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 5; j++) {
				if (a[i][j] != a[j][i]) { // invalida a simetria
					simetria = false;
					break;
				}
			}
		}

		if (simetria) {
			System.out.println("Matriz é Simétrica!");
		} else {
			System.out.println("Matriz não é Simétrica!");
		}
	}

}
