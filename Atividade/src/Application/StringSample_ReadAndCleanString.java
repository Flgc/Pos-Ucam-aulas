/*
 * 
 * Elabore um programa em Java que leia várias strings 
 * (use . para finalizar) e remova de cada string todas as 
 * ocorrências de uma dada letra oferecida pelo usuário. 
 *  
 */

package Application;

import java.util.Scanner;

public class StringSample_ReadAndCleanString {

	public static void main(String[] args) {
		String str, strnova=" ";
		char letra;
		int i;
		Scanner ler = new Scanner(System.in);
		do
		{
			
		strnova = "";
		System.out.println("Digite uma frase ou ponto(.) para encerrar: ");
		str = ler.nextLine();
		
		if (str.equals("."))
				break;
		System.out.println("Digite a letra a ser removida: ");
		letra = ler.nextLine().charAt(0);
		for (i=0; i<str.length();i++) {
				if (str.charAt(i)!=letra)
					strnova += str.charAt(i);
				}
		System.out.println("String final = "+strnova);
		} while (true);

	}

}


