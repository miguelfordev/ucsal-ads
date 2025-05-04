package lista_pilha;

import java.util.Scanner;
import java.util.Stack;

public class q2_main {

	public static void main(String[] args) {
		/*2. Escreva um programa que utiliza um objeto Pilha para determinar se uma
string é um Palíndromo (isto é, a string é escrita identicamente de trás para
frente). O programa deve ignorar espaços e pontuação.
		 */
		Stack<Character> pilha = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra =  sc.next().trim().toLowerCase();
		for(char character : palavra.toCharArray()) {
			pilha.push(character);
		}
		boolean vP = false;
		for(int i=pilha.size()-1;i>=0;i--) {
			if(pilha.get(i)==pilha.get((pilha.size()-1)-i)) {
				vP=true;
			} else {
				vP=false;
			}
		}
		if(vP) {
			System.out.println("É palindromo.");
		} else {
			System.out.println("Não é palindromo.");
		}
		sc.close();
	}

}
