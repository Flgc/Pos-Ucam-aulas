package Application;

import java.util.Locale;
import java.util.Scanner;

public class StringSample_charAt {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String msg = "Learning a String to manipulate";
		int i;
		char letter;
		
		Scanner get = new Scanner(System.in);
		
		System.out.println("Insert a character: ");
		letter = get.nextLine().charAt(0); //read a typed letter
		
		for (i=0; i<msg.length(); i++) {
			
			if (msg.charAt(i)==letter) { // compares the letter 
										 // typed to the phrase in the variable
				System.out.println("Character find at position: "+i);
				break;				
			}
//			if (msg.charAt(i)==letter){
//				System.out.println("Character does not exist in the message!");
//				break;
//			}
		}
		get.close();
	}

}