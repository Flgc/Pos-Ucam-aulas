package Application;

import java.util.Scanner;

public class ExamplePrimerNumber {

	public static void main(String[] args) {
		
		int num, d, td = 0 ; // td é o total de divisores de num
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Digite um número: ");
		
		num = ler.nextInt();
		for (d=1; d<=num; d++)
			if (num % d == 0)
				td++;
		if (td == 2) // divisores o 1 e ele próprio
			System.out.println("O numero "+num+" é primo!");
		else
			System.out.println("O numero "+num+" não é primo!");
	}
}