package exaulas;
import java.util.Scanner;
public class ex021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//ALTERAÇÃO: Faça um programa que receba um número e informe todos os números primos até o valor digitado.
		
		int v,i,j,div;
		
		System.out.print("Digite um número: ");
		v = sc.nextInt();
		
		for(i=1;i<=v;i++) {
			div = 0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					div +=1;
				}
			}
			if(div==2 || i==1) {
				System.out.println("Primo: "+i);
			}
		}

	}

}
