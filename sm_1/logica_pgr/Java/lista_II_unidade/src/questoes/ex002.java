package questoes;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		/* 2) Faça um programa que calcule a soma dos N primeiros números primos, sendo N 
			definido pelo usuário na função main. O programa ainda deverá ter a função primo 
			responsável por verificar se o número em questão é primo ou não. */
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		System.out.print("Digite até aonde vai os numeros: ");
		n = sc.nextInt();
		primo(n);
		sc.close();

	}
	
	public static void primo(int n) {
		int i,j,div=0,soma=0;
		for(i=1;i<=n;i++) {
			div=0;
			for(j=1;j<=i;j++) {
				if(i%j==0) {
					div += 1;
				}
			}
			if(div==2) {
				System.out.printf(i+" é Primo\n");
				soma += i;
			}
		}
		System.out.printf("A soma dos números primos até %d é igual a %d",n,soma);
	}

}
