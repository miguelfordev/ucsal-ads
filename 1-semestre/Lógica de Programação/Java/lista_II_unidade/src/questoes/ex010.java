package questoes;
import java.util.Scanner;
public class ex010 {

	public static void main(String[] args) {
		/* 10) Faça um programa que troque todas as ocorrências de uma letra L1 pela letra L2 em 
			uma string. A string e as letras L1 e L2 devem ser fornecidas pelo usuário. */

		Scanner sc = new Scanner(System.in);
		String palavra,novapalavra="";
		char l1,l2;
		int i;
		System.out.print("Digite a palavra: ");
		palavra = sc.next();
		System.out.print("Digite a letra que quer trocar: ");
		l1 = sc.next().charAt(0);
		System.out.print("Digite a letra a qual substitui a troca: ");
		l2 = sc.next().charAt(0);
		
		for(i=0;i<palavra.length();i++) {
			if(palavra.charAt(i) == l1) {
				novapalavra += l2;
			} else {
				novapalavra += palavra.charAt(i);
			}
		}
		
		System.out.print("Nova palavra é: "+novapalavra);
	}

}
