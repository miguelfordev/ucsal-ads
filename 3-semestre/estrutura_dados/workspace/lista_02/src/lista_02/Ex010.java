package lista_02;

public class Ex010 {

	public static void main(String[] args) {
		/*10 – Desenvolva um método recursivo para calcular o número de Fibonacci de
índice N.*/

		System.out.println(fibo(7));
	}
	
	public static int fibo(int n) {
		if(n<=1) {
			return n;
		} else {
			return fibo(n-1)+fibo(n-2);
		}
	}

}
