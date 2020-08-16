package Application;

import java.util.Locale;
import java.util.Scanner;

public class StringSample_length {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String msg;
		int size;
		Scanner get = new Scanner(System.in);
		
		System.out.println("Insert a phrase ");
		msg = get.nextLine();
		
		size = msg.length(); // Return quantit of characters "length"
		
		System.out.println("The phrase: '"+msg+"' contains " + size + " characters");
		
		get.close();
	}

}
