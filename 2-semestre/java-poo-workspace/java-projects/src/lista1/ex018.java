package lista1;
import java.util.Scanner;
public class ex018 {

    public static void main(String[] args) {
    	/*18) Dizemos que uma matriz inteira A (n x n) é uma matriz de permutação se em cada linha e em 
cada coluna houver n-1 elementos nulos e um único elemento igual a 1. Dada uma matriz inteira A (n 
x n) verificar se A é de permutação. */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n (dimensão da matriz nxn): ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }

        if (MatrizPermutacao(matriz, n)) {
            System.out.println("A matriz é de permutação.");
        } else {
            System.out.println("A matriz não é de permutação.");
        }
    }

    public static boolean MatrizPermutacao(int[][] matriz, int n) {
        for (int i = 0; i < n; i++) {
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == 1) {
                    c++;
                } else if (matriz[i][j] != 0) {
                    return false;
                }
            }
            if (c != 1) {
                return false;
            }
        }

        for (int j = 0; j < n; j++) {
            int c = 0;
            for (int i = 0; i < n; i++) {
                if (matriz[i][j] == 1) {
                    c++;
                } else if (matriz[i][j] != 0) {
                    return false;
                }
            }
            if (c != 1) {
                return false;
            }
        }
        return true;
    }
}
