package provaIIunidade;
import java.util.Scanner;
public class questao1 {

	public static void main(String[] args) {
		/*a) Faça um programa que receba uma palavra e a imprima de trás-para-frente e a
ultima letra da string invertida em maiúsculo. (Valor 1,0)
		 * - Os conceitos de modularização e passagem de parâmetros DEVEM ser utilizados
em todas as questões da prova;
		 */
		
		iniciando();
	}

	public static void iniciando() {
		String palavra = " ";
		System.out.print("Digite a palavra: ");
		palavra = new Scanner(System.in).next();
		manipulandoPalavra(palavra);
		
	}

	public static void manipulandoPalavra(String palavra) {
		for(int i=palavra.length()-1;i>-1;i--) {
			if(i==palavra.length()) {
				System.out.print(palavra.toUpperCase().charAt(i));
			} else {
				System.out.print(palavra.charAt(i));
			}
		}
		
	}

}
