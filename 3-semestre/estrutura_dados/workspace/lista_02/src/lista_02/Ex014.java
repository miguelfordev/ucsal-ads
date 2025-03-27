package lista_02;

public class Ex014 {

	public static void main(String[] args) {
		/*14 – Implemente uma função recursiva que encontre o maior elemento dentro
de um array de inteiros.*/
		
		int vetor[] = new int[5];
		for(int i=0;i<vetor.length-1;i++) {
			vetor[i]+=2+i;
		}
		/*for(int i=0;i<vetor.length-1;i++) {
			System.out.println(vetor[i]);
		}*/
		
		System.out.println(maiorE(vetor,5));

	}
	
	public static int maiorE(int vet[], int n) {
		if(n==0) {
			return vet[0];
		} else {
			return Math.max(vet[n-1], maiorE(vet,n-1));
		}
	}

}
