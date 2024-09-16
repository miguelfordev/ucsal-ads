package lista1;

public class ex020 {

	public static void main(String[] args) {
		/*20) Faça uma função que preencha uma matriz com uma sequência de números iniciada por 1 coluna 
a coluna*/
		 int n = 3;
	     int[][] matriz = new int[n][n];	    
	     preencherMatriz(matriz, n);
	     exibirMatriz(matriz, n);
	    }

	
	    public static void preencherMatriz(int[][] matriz, int n) {
	        int numero = 1; 
	        for (int j = 0; j < n; j++) { 
	            for (int i = 0; i < n; i++) { 
	                matriz[i][j] = numero;
	                numero++;
	            }
	        }
	    }

	    public static void exibirMatriz(int[][] matriz, int n) {
	        System.out.println("Matriz preenchida:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
