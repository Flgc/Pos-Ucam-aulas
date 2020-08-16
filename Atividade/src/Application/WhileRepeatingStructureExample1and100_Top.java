package Application;

public class WhileRepeatingStructureExample1and100_Top {

	public static void main(String[] args) {
		
		int num=1, sum=0;
		
		while(num <= 100) {
			sum += num;
			num++;
		}
		
		System.out.println("Sum of the numbers between 1 and 100 = "+sum);
	}
}
