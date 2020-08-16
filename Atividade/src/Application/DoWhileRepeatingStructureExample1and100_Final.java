package Application;

import java.util.Locale;
import java.util.Scanner;

public class DoWhileRepeatingStructureExample1and100_Final {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		double note;
		Scanner ler = new Scanner(System.in);
		
		do {
			
			System.out.println("Insert a note: ");
			note = ler.nextDouble();
			
			if ((note < 0) || (note > 10) ){
				System.out.println("Invalid note! Insert a new...");
			}
		} while ((note < 0) || (note > 10)); 
			System.out.println("You inserted the note: "+note);
		
		ler.close();
	}
}