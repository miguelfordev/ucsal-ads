package lista_02;

public class Ex015 {

	public static void main(String[] args) {
		/*15 – Escreva um método recursivo para calcular o mínimo múltiplo comum
(MMC) de dois números inteiros positivos.*/
		
		System.out.println(calMMC(2,3));

	}
	
	public static int calMMC(int m, int n) {
		return (m*n) / calMDC(m, n);
	}
	
	public static int calMDC(int m, int n) {
		if(n==0) {
			return m;
		} else {
			return calMDC(n,m%n);
		}
	}

}
