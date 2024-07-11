package exaulas;
import java.util.Random;
public class exaulamatriz2 {

	public static void main(String[] args) {
		int matriz[][];
		
		matriz = carregarVetor();
		mostrarVetor(matriz);
	}
	
	public static int[][] carregarVetor() {
		int i,j,n=0;
		int matriz[][] = new int[5][5];
		Random gerador = new Random();
		
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz.length;j++) {
				if(i==j) {
					matriz[i][j] = 7;
				} else {
					if(i>j) {
						while(true) {
							n = gerador.nextInt(1,10);
							if(n%2==0) {
								matriz[i][j] = n;	
								break;
							}							
						}
						
					} else {
						if(i<j) {
							while(true) {
								n = gerador.nextInt(1,10);
								if(n%2==1) {
									matriz[i][j] = n;
									break;
								}	
							}
						}
					}
				}
			}
		}
		return matriz;
	}
	
	public static void mostrarVetor(int[][] matriz) {
		int i,j;
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz.length;j++) {
				if(matriz[i][j] != -1) {
					System.out.print(" "+matriz[i][j]+" ");
				} else {
					System.out.print(matriz[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
