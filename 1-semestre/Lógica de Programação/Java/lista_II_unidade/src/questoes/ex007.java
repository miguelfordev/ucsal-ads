package questoes;
import java.util.Scanner;
public class ex007 {

	public static void main(String[] args) {
		/* 7) Faça um programa que conte o número de 1’s que aparecem em um string. 
			Exemplo: ́“0011001” -> 3*/

		Scanner sc = new Scanner(System.in);
		String palavra;
		
		System.out.print("Digite um numero binario: ");
		palavra = sc.next();
		verificarum(palavra);
	}
	
	public static void verificarum(String palavra) {
		int i,soma=0;
		for (i=0;i<palavra.length();i++) {
			char letra = palavra.charAt(i);
			if(letra == '1') {
				soma += 1;
			}
		}
		System.out.print("A quantidade de 1 é igual a: "+soma);
	}

}
