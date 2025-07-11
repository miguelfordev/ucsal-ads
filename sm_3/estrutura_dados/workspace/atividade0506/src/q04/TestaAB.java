package q04;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class TestaAB {

	public static void main(String[] args) {
		/* 4- Utilizando todos os conceitos das aulas da 2 unidade,
				implemente um algoritmo que receba 10 números e coloque em uma árvore.
				Ao consultar a árvore (pode ser qualquer um tipo de caminhamento).
				Em uma pilha insira os números pares e em uma fila os números ímpares. Liste os números contidos na fila e na pilha. 
		 * */

		AB<Integer> ab = new AB<>();
		Scanner sc = new Scanner(System.in);
		Queue<Integer> fila = new LinkedList<>();
		Stack<Integer> pilha = new Stack<>();
		menu(ab, sc, fila, pilha);

	}
	
	private static void menu(AB<Integer> ab, Scanner sc, Queue<Integer> fila, Stack<Integer> pilha) {
		int op=0, n, c=0, aux, op2;
		while(op!=8) {
			String menuzin = """
					1- Adicionar numero a arvore.
					2- Listar Pré Ordem.
					3- Listar Em Ordem.
					4- Listar Pos Ordem.
					5- Adicionar a fila ou a pilha.
					6- Listar fila.
					7- Listar pilha.
					8- Sair.
					Opção: """;
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
				ab.exibirOrdem(ab.getR());
				break;
			case 4:
				ab.exibirPosOrdem(ab.getR());
				break;
			case 5:
				System.out.println("Digite um numero: ");
				n = sc.nextInt();
				if(verI(n) && n>=0) {
					fila.add(n);
					System.out.println("Numero impar adicionado a fila com sucesso.");
				} else {
					pilha.add(n);
					System.out.println("Numero par adicionado a pilha com sucesso");
				}
				break;
			case 6:
				Iterator<Integer> it = fila.iterator();
				while(it.hasNext()) {
					System.out.println(it.next()+" ");
				}
				break;
			case 7:
				Iterator<Integer> it2 = pilha.iterator();
				while(it2.hasNext()) {
					System.out.println(it2.next()+" ");
				}
			case 8:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Opção incorreta");
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
