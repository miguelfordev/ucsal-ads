package lista1;
import java.util.Scanner;
public class ex013 {

	public static void main(String[] args) {
		/*13) Faça um programa que receba um número inteiro e informe se é um número primo.*/

		int n,div=0;
		System.out.print("Numero: "); n = new Scanner(System.in).nextInt();
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				div+=1;
			}
		}
		if(div==2) {
			System.out.print("pRIMO");
		}
	}

}
