package questoes;
import java.util.Scanner;
public class ex004 {

	public static void main(String[] args) {
		/* 4) Faça um programa que receba um nome e imprima o nome somente se a primeira 
			letra do nome for ‘a’ (maiúscula ou minúscula). */
		Scanner sc = new Scanner(System.in);
		String nome;
		System.out.print("Digite o nome: ");
		nome = sc.next();
		
		char primeiraLetra = nome.charAt(0);
		
		if(primeiraLetra == 'a' || primeiraLetra == 'A') {
			System.out.print(nome+" -> Tem a letra A.");
		}
	}

}
