package lista1;
import java.util.*;
public class ex010 {

	public static void main(String[] args) {
		/*10)Faça um programa que receba um número e informe se é um termo da sequência de Fibonacci. Na 
sequência de Fibonacci cada termo é a soma dos dois termos anteriores:
1, 1, 2, 3, 5, 8, 13...*/

		int n = new Scanner(System.in).nextInt();
		
		int n1=1;
		int n2=1;
		int n3=n1+n2;
		do {
			if(n3<n) {
				n1 = n2;
				n2 = n3;
				n3 = n1+n2;
			}
		} while(n3<n);
		
		if(n3==n) {
			System.out.print("É um numero da sequencia de fibonnaci");
		} else {
			System.out.print("Ñ é um numero da sequencia de fibonnaci");
		}
	}

}
