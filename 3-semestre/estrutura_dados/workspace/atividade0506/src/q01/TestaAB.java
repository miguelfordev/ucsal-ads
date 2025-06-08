package q01;

import java.util.Scanner;

public class TestaAB {

	public static void main(String[] args) {
		/*1 -    Implemente uma estrutura de árvore que receba 10 números inteiros. 
		 * O programa deve permitir apenas números ímpares sejam inseridos na árvore. 
		 * Ao listar os elementos, deverá usar o pré-ordem.
		 * */

		AB<Integer> ab = new AB<>();
		Scanner sc = new Scanner(System.in);
		menu(ab, sc);

	}
	
	private static void menu(AB<Integer> ab, Scanner sc) {
		int op=0, n, c=0, aux, op2;
		while(op!=3) {
			String menuzin = """
					1- Adicionar numero
					2- Listar
					3- Sair
					""";
			System.out.println(menuzin);
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Digite um numero: ");
				n = sc.nextInt();
				if(verI(n) && c==0 && n>=0) {
					System.out.println("Raiz adicionada.");
					ab.addR(n);
					c++;
				} else if(verI(n) && c>0 && n>0){
					System.out.println("Adicionar\n 1-direita\n 2-esquerda: ");
					op2 = sc.nextInt();
					if(op2==1) {
						System.out.println("Digite em qual Nó quer adicionar na direita: ");
						aux = sc.nextInt();
						ab.addD(ab.bscNo(aux), n);
						c++;
						System.out.println("No adicionado.");
					} else if(op2==2) {
						System.out.println("Digite em qual Nó quer adicionar na esquerda: ");
						aux = sc.nextInt();
						ab.addE(ab.bscNo(aux), n);
						c++;
					}
				} else {
					System.out.println("Digite um numero impar maior ou igual a zero.");
				}
				break;
			case 2:
				ab.exibirPreOrdem(ab.getR());
				break;
			case 3:
				System.out.println("Volte sempre.");
				break;
			case 4:
				System.out.println("Opção incorreta.");
			}
		}
	}

	private static boolean verI(int n) {
		if(n%2==1) {
			return true;
		}
		return false;
	}

}
