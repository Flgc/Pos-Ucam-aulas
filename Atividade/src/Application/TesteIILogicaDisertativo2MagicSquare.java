/**
 * 
 *Developed for the: Fabio Luis
 *Date: 12/08/2020
 *University: UCAM - Pós Graduação em Orientação a Objeto com Java 
 *
 *Quadrado Mágico é uma tabela quadrada de lado , em que a soma dos números das linhas, 
 *das colunas e das diagonais é constante, sendo que nenhum destes números se repete. 
 *Veja o exemplo:
 *
 *2 7 6
 *9 5 1 ===> total das linhas ou colunas ou diagonais darão 15 (3 x 3) 
 *4 3 8
 *
 *Primeiramente o programa deve pedir ao usuário o valor do lado do quadrado (dimensão da matriz,
 *sendo superior a 2) e então calcular o valor que deverá ser a soma das linhas, colunas e diagonais. 
 *A fórmula pode ser calculada de duas formas:
 *
 *1ª) Soma-se todos os dígitos a serem inseridos, exemplo para uma matriz de lado 3, serão inseridos
 * dígitos de 1 a 9 sendo que a soma dos mesmos é igual a 45. Divide-se este número por 3, 
 * temos que a somatória deverá ser 15.
 * 
 * 2ª) Utilizando-se a fórmula S = (n + n3) / 2, sendo n o lado do quadrado e maior que dois.
 * Assim, para o quadrado (3 x 3), a somatória é obtida da seguinte forma:
 * 
 * S = (3 + 33) / 2 = 15
 * 
 * Em seguida, deve-se pedir os números de 1 a 9 em 9 casas, verificando se a soma das linhas, 
 * colunas e diagonais sejam iguais a 15, no exemplo.
 * 
 * Imprimir a mensagem “Quadrado Mágico” ou “Não é um Quadrado Mágico”.
 *
 * 
 */

package Application;

import java.util.Scanner;

public class TesteIILogicaDisertativo2MagicSquare {

	public static void main(String[] args) {

		int line, colum, dimension;
		int sumMainDimension, sumSecondarDimension,lineSum,columSum;
		boolean go = false;
		
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter the value for the side of the square: ");
				
		dimension = read.nextInt();
		
		if (dimension > 2) {
			
			go=true;
		}
		else {	
			System.out.println("Enter a value greater than two!");
		}
		
		if (go==true) {
			System.out.println();
			
			int matrix[][] = new int[dimension][dimension];
			int lineMatrix[] = new int[dimension];
			int columMatrix[] = new int[dimension];
			 
			System.out.println("Generating matrix "+dimension+" x "+dimension);
			System.out.println();
			
			for (line = 0; line < dimension; line++) {
				
				for (colum = 0; colum < dimension; colum++) {
					
					System.out.println("Inserting matrix "+matrix[line][colum]);
					
					matrix[line][colum] = read.nextInt();
					
				}
				
			}
			
			System.out.println();
			System.out.println("Generated matrix");
			System.out.println();
			
			for (line=0; line<dimension; line++) { 
				
				for (colum=0; colum < dimension; colum++) {
				
					System.out.print(matrix[line][colum]);
				
				}
				
				System.out.println("");
				
			}
	
			sumMainDimension=sumSecondarDimension=0;
			System.out.println();
			System.out.print("Waiting for sums of the main diagonals");
			
			for (line=0; line < dimension; line++) {
				
				sumMainDimension += matrix[line][line];
				
			}
			
			System.out.print("Waiting for sums of the secondary diagonals");
			
			for (line=0; line < dimension; line++) {
				
				sumSecondarDimension += matrix[line][dimension-line-1];
				
			}
			
			System.out.print("                                             ");
			System.out.println("Analyzing sum of the lines: ");
			
			for(line=0; line<dimension; line++) {
				
				lineMatrix[line]=0;
				
				for(colum=0;colum < dimension; colum++) {
					
					lineMatrix[line] += matrix[line][colum];
					
				}
			}
	
			System.out.print("                                             ");
			System.out.println("Totalit sum of the lines!");
			
			for (line=0; line < dimension; line++) {
				
				System.out.println(lineMatrix[line]);
				
			}
			
			System.out.print("                                             ");
			System.out.println("Analyzing sum of the coluns: ");
			
			for(colum=0; colum<dimension; colum++) {
				
				columMatrix[colum]=0;
				
				for(line=0;line < dimension; line++) {
					
					columMatrix[colum] += matrix[line][colum];
					
				}
			}
	
			System.out.print("                                             ");
			System.out.println("Totalit sum of the coluns!");
			
			for (line=0; line < dimension; line++) {
				
				System.out.println(columMatrix[line]);
				
			}	
			
			System.out.println();
			System.out.println("The sum of main diagonal is "+sumMainDimension+" and secondary is "+sumSecondarDimension);


			lineSum=columSum=1;
			
			for (line=1; line < dimension; line ++) {
				if (lineMatrix[line] != lineMatrix[line-1]) {
					lineSum=0;
					break;
				}
				else {
					if(columMatrix[line] != columMatrix[line-1]) {
						columSum=0;
						break;
					}
				}
			}
			
			System.out.println();
			if (lineSum==columSum && sumMainDimension == sumSecondarDimension && sumMainDimension == lineMatrix[0]) {
				System.out.println("It's a magic square!");
			}else {
				System.out.println("It's not magic square");
			}
		}
		
		
		read.close();
	}

}
