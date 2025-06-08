package monitoria;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	
		/* 1. Faça uma função que preencha uma matriz com uma sequência de números iniciada
por 1 coluna a coluna.
Exemplo:
1 4 7
2 5 8
3 6 9 
		 */
		
		int[][] matriz = new int[3][3];
		preencher(matriz);
		mostrar(matriz);
		
	
	}
	
	public static void mostrar(int[][] matriz) {
		for(int c=0; c<matriz.length; c++) {
			for(int l=0;l<matriz.length;l++) {
				System.out.print(matriz[l][c]+" ");
			}
			System.out.println();
		}
	}
	
	public static void preencher(int[][] matriz) {
		int cont=1;
		for(int l=0; l<matriz.length; l++) {
			for(int c=0;c<matriz.length;c++) {
				matriz[l][c]=cont;
				cont++;
			}
		}
	}

}
