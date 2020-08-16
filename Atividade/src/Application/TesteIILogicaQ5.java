package Application;

public class TesteIILogicaQ5 {

	public static void main(String[] args) {

		int A[][] = new int[10][10];
		int V[] = new int[10];
		int i, j;

		for (i=0; i<10; i++) {
			V[i] = 0;
			for (j=0; j<10; j++) {
				V[i] *= A[i][j];
				
				System.out.println(A[i][j]);
			}
		
		}

	}
}