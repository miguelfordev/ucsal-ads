package exaulas;
import java.util.Random;
public class questao2_sala_07_06 {

	public static void main(String[] args) {
		/* Faça um programa que realize  uma operação de soma entre 2 matrizes 4x4 e mostre o resultado.
		 * Com valores randomicos.
		 * A) Em uma outra matriz 4x4
		 * B) Em 4 vetores
		 * 
		 * USAR MODULARIZAÇAO
*/
		
		int matrizA[][] = new int[4][4];
		int matrizB[][] = new int[4][4];
		int matrizC[][] = new int[4][4];
		
		carregar(matrizA);
		carregar(matrizB);
		mostrar(matrizA, 1);
		mostrar(matrizB, 2);
		operacao(matrizA,matrizB,matrizC);
		mostrar(matrizC, 3);
		transformandoVetor(matrizC);

	}
	
	public static void transformandoVetor(int[][] matriz) {
		int vetor[] = new int[4];
		int num = 0;
		System.out.print("\n");
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				num = matriz[l][c];
				vetor[c] = num;
			}
			System.out.printf("%dº Vetor -> ",l+1);
			for(int v=0;v<vetor.length;v++) {
				System.out.printf("%d ",vetor[v]);					
			}
			System.out.print("\n");
		}
	}
	
	public static void operacao(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
		for(int l=0;l<matrizC.length;l++) {
			for(int c=0;c<matrizC.length;c++) {
				matrizC[l][c] = matrizA[l][c]+matrizB[l][c];
			}
		}
	}
	
	public static void carregar(int[][] matriz) {
		Random gerador = new Random();
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				matriz[l][c] = gerador.nextInt(10);
			}
		}
	}
	
	public static void mostrar(int[][] matriz, int id) {
		switch(id) {
		case 1: 
			System.out.print("\nInicio da Matriz A\n");
			break;
		case 2:
			System.out.print("\nInicio da Matriz B\n");
			break;
		case 3:
			System.out.print("\nInicio da Matriz C\n");
			break;
		}
		for(int l=0;l<matriz.length;l++) {
			for(int c=0;c<matriz.length;c++) {
				if(c<matriz.length-1) {
					if(matriz[l][c]>=10) {
						System.out.printf("%d|",matriz[l][c]);											
					} else {
						System.out.printf("%d |",matriz[l][c]);	
					}
				} else {
					System.out.print(matriz[l][c]);
				}
			}
			System.out.print("\n");
		}
	}

}