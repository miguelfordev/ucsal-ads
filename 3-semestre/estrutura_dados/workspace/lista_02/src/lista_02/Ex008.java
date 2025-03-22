package lista_02;

public class Ex008 {

	public static void main(String[] args) {
		/*8 – Crie uma função recursiva que calcule a soma dos primeiros N números
naturais.*/

		System.out.println(soma(10));
	}

	public static int soma(int n) {
		if(n==0) {
			return 0;
		} else {
			return n+soma(n-1);
		}
	}
}
