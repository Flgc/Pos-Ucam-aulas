package Application;

public class ExempleMatrix1 {

	public static void main(String[] args) {
		
		int a[][] = new int [5][4]; // allocating matrix with 5 rows and 4 columns
		int l,c;
		
		for (l=0; l<5; l++) {
			for (c=0; c<4; c++) {
				a[l][c] = (l+1);
			}
		}
		System.out.println("Generatede matrix: ");
		
		for(l=0; l<5; l++) {
			for (c=0; c<4; c++) {
				System.out.print(a[l][c]+"");
				System.out.println();
			}
		}
	}

}
