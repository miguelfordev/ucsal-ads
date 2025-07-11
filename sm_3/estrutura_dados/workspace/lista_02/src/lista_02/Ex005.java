package lista_02;

public class Ex005 {

	public static void main(String[] args) {
		/*5 - Escreva uma função recursiva que imprima todos os números inteiros de 1
até n, onde n é um número inteiro positivo fornecido como entrada.*/

		mostrarN(10);
	}
	
	public static void mostrarN(int n) {
		if(n==1) {
			System.out.println(n);
		} else {
			mostrarN(n-1);
			System.out.println(n);
		}

	}

}
