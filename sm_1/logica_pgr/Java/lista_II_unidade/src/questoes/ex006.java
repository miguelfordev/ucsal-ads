package questoes;
import java.util.Scanner;
public class ex006 {

	public static void main(String[] args) {
		/*6) Faça um programa que receba uma palavra e a imprima de trás-para-frente. */
		
		Scanner sc = new Scanner(System.in);
		String palavra;
		
		System.out.print("Digite a palavra: ");
		palavra = sc.next();
		
		trasfrente(palavra);
	}

	public static void trasfrente(String palavra) {
		int i;
		for(i=palavra.length()-1;i>=0;i--) {
			System.out.print(palavra.charAt(i));
		}
		
	}
}
