package Application;

public class ExampleMatrix2 {

	public static void main(String[] args) {
		int a [][] = {{5,5,5,5},
				{4,4,4,4},
				{3,3,3,3},
				{2,2,2,2},
				{1,1,1,1} 
				};
				int l,c;

		System.out.println("Generated Matrix:");
		for (l=0; l<5; l++){
			for (c=0; c<4; c++) {
				System.out.print(a[l][c]+"");
				System.out.println();
			}
		}
		
	}

}