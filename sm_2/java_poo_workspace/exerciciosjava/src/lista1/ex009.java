package lista1;
import java.util.*;
public class ex009 {

	public static void main(String[] args) {
		/* 9) Faça um programa que receba um valor n e em seguida informe o valor de S.
a) s=1+1/2+1/3+...+1/n
b) s=1/n + 2/(n-1) + 3/(n-2) +...+ (n-1)/2+n
c) s=1 - 1/2 + 1/3- 1/4 +...+ 1/n
		 */
		
		double n = new Scanner(System.in).nextInt();
		double s=1;
		for(double i=1;i<n;i++) {
			s = s+1/(i+1);
		}
		System.out.println("Soma: "+s);	
	}

}
