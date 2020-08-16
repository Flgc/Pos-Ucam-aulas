package Application;

import java.util.Locale;

public class StringSample_toUpperCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String msg = "Learning a String to manipulate";
		
		msg = msg.toUpperCase();
		
		System.out.println("Phrase: "+msg);

	}
}