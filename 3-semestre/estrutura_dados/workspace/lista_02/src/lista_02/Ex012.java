package lista_02;

public class Ex012 {

	public static void main(String[] args) {
		/*12 – Crie uma função recursiva que calcule a soma dos elementos de um array
de inteiros.*/

		int vetor[] = new int[5];
		for(int i=0;i<vetor.length-1;i++) {
			vetor[i] += i;
		}
		System.out.println(somaA(vetor,5));
		
		/*for(int i=0;i<vetor.length-1;i++) {
			System.out.println(vetor[i]);;
		}*/
	}
	
	public static int somaA(int vet[],int n) {
		if(n==0) {
			return 0;
		} else {
			return vet[n-1] + somaA(vet, n-1);
		}
	}

}
