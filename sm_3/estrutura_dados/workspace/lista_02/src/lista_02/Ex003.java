package lista_02;

public class Ex003 {

	public static void main(String[] args) {
		/*3 – Escreva em java um método recursivo que receba um número inteiro na
base decimal e realize a conversão deste número para base binária.*/

		System.out.println(Bin(5));
	}
	
	public static String Bin(int n) {
		if(n==0) {
			return "0";
		} else if (n==1){
			return "1";
		} else {
			return Bin(n/2)+(n%2);
		}
	}

}
