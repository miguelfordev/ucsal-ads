package lista_pilha;

import java.util.Scanner;
import java.util.Stack;

public class q3_main {

	public static void main(String[] args) {
		/*3. Crie um programa que gerencie uma PILHA de TAREFAS a serem
cumpridas. As tarefas são strings que descrevem uma ação a ser executada. O
usuário deverá ter duas opções:
a) Inserir tarefa na pilha;
b) Obter a próxima tarefa da pilha.*/

		Stack<String> pilha = new Stack<>();
		menu(pilha);
	}
	
	public static void menu(Stack<String> pilha) {
		Scanner sc = new Scanner(System.in);
		int op=0;
		while(op!=3) {
			System.out.println("--- Tarefa principal ---");
			if(pilha.size()==0) {
				System.out.println("Sem tarefas.");
			} else {
				System.out.println(pilha.peek());
			}
			String menu_op= """
					--- MENU ---
					1. Inserir tarefa na pilha.
					2. Obter proxima tarefa da pilha.
					3. Sair.
					Opção:
					""";
			System.out.print(menu_op);
			op = sc.nextInt();
			switch(op) {
			case 1: 
				System.out.println("Digite tarefa: ");
				pilha.push(sc.next());
				break;
			case 2:
				pilha.pop();
				break;
			case 3:
				System.out.println("Volte sempre");
				break;
			default:
				System.out.println("Opção inválida.");
			}
		}
		sc.close();
	}

}
