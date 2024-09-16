package lista1;
import java.util.Scanner;
public class ex017 {

	public static void main(String[] args) {
		/*17) Faça um programa que preencha um vetor com 50 valores recebidos pelo teclado e, ao final, informe a 
posição do maior número. Desconsidere a possibilidade de empate.
*/
		Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[50];

        System.out.println("Digite 50 valores inteiros:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor %d: ", i + 1);
            vetor[i] = scanner.nextInt();
        }

        int maior = vetor[0];
        int posicaoMaior = 0;

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicaoMaior = i;
            }
        }

        System.out.printf("O maior número é %d e está na posição %d.\n", maior, posicaoMaior);
	}

}
