package questoes;
import java.util.Arrays;
import java.util.Random;
public class ex12 {

	public static void main(String[] args) {
		/*12) Implemente um programa que preencha um vetor com 50 números inteiros e 
classifique-os em ordem crescente.
		 */
		
		int[] vetor = new int[50]; 
		preencherVetor(vetor);
		mostrarVetor(vetor);
		
	}
	
	public static void preencherVetor(int[] vetor) {
		Random gerador = new Random();
		
		for(int c=0;c<vetor.length;c++) {
			vetor[c] = gerador.nextInt(50);
		}
	}
	
	public static void mostrarVetor(int[] vetor) {
		Arrays.sort(vetor);
		for(int c=0;c<vetor.length;c++) {
			System.out.printf("%d ", vetor[c]);
		}
		System.out.println();
		for(int c=vetor.length-1;c>0;c--) {
			System.out.printf("%d ", vetor[c]);
		}
	}

}
