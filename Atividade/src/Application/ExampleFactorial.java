package Application;

public class ExampleFactorial {

	public static void main(String[] args) {
		
		int f, num=6;
		
		for (f=1; num>0; f*=num, num--) {
			System.out.println(f + " " + num);
		}
		
	}

}
