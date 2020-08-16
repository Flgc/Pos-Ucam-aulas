package Application;

public class ExampleMatrix5 {

	public static void main(String[] args) {
		
		int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String name_month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		int calendar [][] = new int[12][];
		int l,c;
		
		for (l=0; l<12; l++) {
			calendar[l] = new int[month[l]]; // allocating number of columns relative to the month
		}
		
		for (c=0; c<month[l]; c++ ) {
			calendar[l][c] = c+1; // numbering days 1, 2, ...
		}
		
		System.out.println("Calandar: ");
		
		for (l=0; l<12; l++) {
			System.out.println("Month "+name_month[l]+" = ");
			
			for(c=0; c<month[l]; c++) {
				System.out.println(calendar[l][c]+"");
				System.out.println();
			}
		}
	}

}
