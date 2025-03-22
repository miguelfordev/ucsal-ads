package lista_02;

public class Ex001 {

	public static void main(String[] args) {
		/* 1 – O método a seguir, executa o cálculo do MDC (máximo divisor comum) de
		dois inteiros positivos m e n. Escreva um método recursivo equivalente.
		public static int CalculaMDC(int m, int n){
		int r;
		do{
		r = m%n;
		m = n;
		n = r;
		} while (r != 0);
		return m;
		}*/

		System.out.println(CalculaMDC(18,60));
	}
	
	public static int CalculaMDC(int m, int n) {
		if(n==0) {
			return m;
		} else {
			return CalculaMDC(n,m%n);
		}
	}

}
