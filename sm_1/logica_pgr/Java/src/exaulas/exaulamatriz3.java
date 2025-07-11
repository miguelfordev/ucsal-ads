package exaulas;

public class exaulamatriz3 {

	public static void main(String[] args) {
		int matriz[][];
		
		matriz = carregarVetor();
		mostrarVetor(matriz);
	}
	
	public static int[][] carregarVetor(){
		int i,j;
		int matriz[][] = new int [5][5];
		
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz.length;j++) {
				if(j==0 || j%2==0) {
					matriz[i][j] = 0;
				} else {
					matriz[i][j] = 1;
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
