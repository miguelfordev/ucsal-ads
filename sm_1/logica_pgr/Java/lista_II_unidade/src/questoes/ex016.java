package questoes;
import java.util.Arrays;
import java.util.Random;
public class ex016 {

	public static void main(String[] args) {
		/*16) Utilizando-se do conceito de modularização, faça um programa que obtenha do 
usuário uma matriz quadrada (10x10) e troque o maior elemento de cada linha com o 
elemento da diagonal. 
		 */
		
		int[][] matriz = new int[10][10];
		preenchandoMatriz(matriz);
		//trocandoElemento(matriz);
		//imprimindoMatriz(matriz);
		
		imprimindoMatriz(matriz);

	}
	
	public static void preenchandoMatriz(int[][] matriz) {
		Random gerador = new Random();
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				matriz[l][c] = gerador.nextInt(50);
			}
			
		}
	}

	public static void imprimindoMatriz(int[][] matriz) {
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				System.out.print(" "+matriz[l][c]);
			}
			System.out.println();
		}
	}

	public static void trocandoElemento(int[][] matriz) {
		for(int l=0;l<matriz.length;l++) {
			int maior = matriz[l][0];
			int indiceMaior = 0;
			
			for(int c=0;c<matriz.length;c++) {
				if(matriz[l][c] > maior) {
					maior = matriz[l][c];
					indiceMaior = c;
				}
			}
			
			int temp = matriz[l][l];
			matriz[l][l] = matriz[l][indiceMaior];
			matriz[l][indiceMaior] = temp;
		}
		
	}
}
