package questoes;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		/* 8) Faça um programa que receba uma string e uma letra e informe quantas vezes a letra 
			recebida aparece na string. */
		Scanner sc = new Scanner(System.in);
		
		String palavra,letra;
		System.out.print("Digite uma palavra: ");
		palavra = sc.next();
		System.out.print("Digite uma letra: ");
		letra = sc.next();
		
		verificar(palavra.toLowerCase(),letra.toLowerCase());
		
	}
	
	public static void verificar(String palavra, String letra) {
		int i,cont=0;
		char verletra = letra.charAt(0);
		for(i=0;i<palavra.length();i++) {
			if(palavra.charAt(i) == verletra) {
				cont += 1;
			}
		}
		System.out.printf("A letra %s apareceu %d vezes.",letra.toUpperCase(),cont);
		
	}

}
