package lista_pilha;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class q1_main {

	public static void main(String[] args) {
		/*1. Crie um programa em java para gerenciar os livros que deverão ser lidos
		durante as férias e para a solução do problema utilize o conceito de pilhas,
		tenha as seguintes opções:
		a) Inserir na Pilha
		b) Consultar na Pilha
		c) Remover na Pilha
		d) Esvaziar na Pilha
		e) Sair.*/
		Stack<String> pilhaLivro = new Stack<>();
		menu(pilhaLivro);
	}

	public static void menu(Stack<String> pilha) {
		int op = 0;
		Scanner sc = new Scanner(System.in);
		while (op != 5) {
			String menu_op = """
					=== MENU ===
					1. Inserir livro na pilha.
					2. Constular livro na pilha.
					3. Remover livro do topo da pilha.
					4. Esvaziar na pilha.
					5. Sair
					Opção:
					""";
			System.out.print(menu_op);
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Digite o nome do livro: ");
				String nome = sc.next();
				pilha.push(nome);
				break;
			case 2:
				System.out.println("Livros na pilha a partir do topo.");
				for (int i = pilha.size() - 1; i >= 0; i--) {
					System.out.println(pilha.get(i));
				}
				break;
			case 3:
				System.out.println("Removendo do topo.");
				pilha.pop();
				break;
			case 4:
				System.out.println("Esvaziando a pilha.");
				Iterator<String> it = pilha.iterator();
				while (it.hasNext()) {
					pilha.pop();
				}
				break;
			case 5:
				System.out.println("Volte sempre.");
				break;
			default:
				System.out.println("Opção inválida.");
				break;
			}
		}
		sc.close();
	}
}
