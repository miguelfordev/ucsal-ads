package lista1;
import java.util.Scanner;
public class ex019 {

	public static void main(String[] args) {
		/*19) Faça um programa que preencha uma matriz quadrada de forma que:
• os elementos da diagonal principal sejam todos zero
• os elementos acima da diagonal principal sejam todos iguais a 1
• os elementos abaixo da diagonal principal sejam todos iguais a -1
*/
		 Scanner scanner = new Scanner(System.in);
	     System.out.print("Digite o valor de n (dimensão da matriz nxn): ");
	     int n = scanner.nextInt();

	     int[][] matriz = new int[n][n];

	     for (int i = 0; i < n; i++) {
	         for (int j = 0; j < n; j++) {
	                if (i == j) {
	                    matriz[i][j] = 0;       
	                } else if (i < j) {
	                    matriz[i][j] = 1;        
	                } else {
	                    matriz[i][j] = -1;      
	                }
	            }
	        }

	        System.out.println("Matriz preenchida:");
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}
