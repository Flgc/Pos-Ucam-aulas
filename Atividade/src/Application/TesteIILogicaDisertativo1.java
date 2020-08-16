/**
 * 
 *Developed for the: Fabio Luis
 *Date: 09/08/2020
 *
 *Uma fábrica de autopeças usa uma matriz 4x12 para armazenar a produtividade anual. 
 *Cada linha indica uma semana e cada coluna indica um mês. A tabela abaixo ilustra 
 *um exemplo desta matriz.
 *
 *Escreva um programa que gere randomicamente esta matriz 
 *(valores menores que 90) e em seguida calcule e mostre: 
 *
 *a) O total de peças produzidas em cada mês. - ok
 *b) A produção do ano. - ok
 *c) A melhor produção semanal de todas as semanas e em que semana e em que mês ela ocorreu. 
 * 
 */

package Application;

import java.util.Random;

public class TesteIILogicaDisertativo1 {

	public static void main(String[] args) {

		int product[][] = new int[4][12];
		int totPecMont[] = new int[12];
		Random generator = new Random();
		int week, month, currentWeek,currentMonth;
		int totProdYear, bestProdWeek, bestMonth;

		System.out.println("Generating random matrix elements...");

		currentWeek=0;bestProdWeek=0;bestMonth=0;
		
		for (week = 0; week < 4; week++) {
			for (month = 0; month < 12; month++) {
				product[week][month] = generator.nextInt(90); // allocate random numbers small of 90

				System.out.println(" Week [" + week + " Month [" + month + " Value: " + product[week][month]);
				
				if (product[week][month] > bestProdWeek) {					
					bestProdWeek = product[week][month];
					currentWeek = week;
					bestMonth=month;					
				}
				
			}
			System.out.println("");
		}
		
		for (currentMonth=0; currentMonth<12; currentMonth++) { 
			for (week=0; week < 4; week++) {
				for (month=0; month < 12; month++) {				
					if (month == currentMonth) {
						totPecMont[month] += product[week][month]; // sum of the month.
					}
				}
			}
		}
		totProdYear=0;month=0;
		System.out.println("Totality production for the month :");
		while(month<12) {		
			//System.out.println("Totality production for the month ["+month+"] = "+totPecMont[month]);
			System.out.print(month+"="+totPecMont[month]+" | ");
			totProdYear+=totPecMont[month];
			month++;
		}
		System.out.println("");
		System.out.println("Production of the year: "+totProdYear);
		
		System.out.println("The best production was in "+"Week = "+currentWeek+" month = "+bestMonth+" value = "+bestProdWeek);

	}

}
