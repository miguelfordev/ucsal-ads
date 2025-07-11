package lista_02;

public class Ex006 {

	public static void main(String[] args) {
		/*6 - Escreva uma função recursiva que imprima uma contagem regressiva a
partir de um número inteiro positivo fornecido como entrada.*/

		mostrarN(10);
	}
		
	public static void mostrarN(int n) {
		if(n==1) {
			System.out.println(n);
		} else {
			System.out.println(n);
			mostrarN(n-1);
		}

	}

}
