/**
 * Never use "==" to compare Strings, only the equal() method.
 *   
 */
package Application;

import java.util.Locale;

public class StringComparationAttention_equalIgnoreCase {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		String s1 = "Java", s3;
		s3 = new String("java");
		
		if (s1.equalsIgnoreCase(s3)) { //This test will be true --> Correct comparation
			System.out.println("Equal strings: "+ s1 +" == " + s3);
		}
	}

}