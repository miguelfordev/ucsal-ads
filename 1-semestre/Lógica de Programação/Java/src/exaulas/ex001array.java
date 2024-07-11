package exaulas;
import java.util.Scanner;
public class ex001array {

	public static void main(String[] args) {
		//Faça um programa que receba em um vetor de
		//10 números e mostre na tela os números pares.
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int B[] = new int[10];
		
		for(i=0;i<B.length;i++) {
			System.out.println("Digite um numero: ");
			B[i] = sc.nextInt();
			sc.close();
		};
		
		for(i=0;i<B.length;i++) {
			if(B[i]==6) {
				System.out.println("Digite o numero para alterar: ");
				B[i] = sc.nextInt();	
				sc.close();
			}
		}
		
		for(i=0;i<B.length;i++) {
			if(B[i]%2==0) {
				System.out.print(B[i]+" ");				
			}
		};
		
		sc.close();

	}

}
