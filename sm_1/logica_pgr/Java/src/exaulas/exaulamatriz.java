package exaulas;

public class exaulamatriz {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4]; 
		carregarVetor(matriz);
		mostrarVetor(matriz);
	}
	
	public static void carregarVetor(int[][] matriz) {
		int i,j;
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz.length;j++) {
				if(i==j) {
					matriz[i][j] = 0;
				} else {
					if(i<j) {
						matriz[i][j] = 1;
					} else {
						if(i>j) {
							matriz[i][j] = -1;
						}
					}
				}
			}
		}
	}
	
	public static void mostrarVetor(int[][] matriz) {
		int i,j;
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz.length;j++) {
				if(matriz[i][j] != -1) {
					System.out.print(" "+matriz[i][j]+" |");
				} else {
					System.out.print(matriz[i][j]+" |");
				}
			}
			System.out.println();
		}
	}

}
