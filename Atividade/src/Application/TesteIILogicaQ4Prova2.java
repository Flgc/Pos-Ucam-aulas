/**
A instrução for da linguagem Java é muito poderosa. 
Nela podem ser inicializadas várias variáveis e, 
ainda, possuir várias operações a serem processadas 
após a finalização do bloco a ser repetido. 
Assim, examine a instrução for abaixo: 
Considerando, todas as variáveis devidamente declaradas, 
ao término desta repetição, as variáveis i, j e k 
terão os seguintes valores, respectivamente:
 */

package Application;

public class TesteIILogicaQ4Prova2 {

	public static void main(String[] args) {

		int i, k, j;
		
			for (i=1, j=10, k=0; i<j; i+=2,j--) {
				k +=i;
			}
			System.out.println("i = "+i+" j = "+j+" k = "+ k);
	}

}


