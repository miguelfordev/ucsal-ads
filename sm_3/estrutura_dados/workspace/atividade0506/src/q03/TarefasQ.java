package q03;
import java.util.Scanner;
import java.util.Stack;

public class TarefasQ {

	public static void main(String[] args) {
		/* - Crie um programa que gerencie uma FILA de TAREFAS a serem cumpridas.
		 *  As tarefas são strings que descrevem uma ação a ser executada.
		 *   O usuário deverá ter duas opções:
				a)    Inserir tarefa na FILA;
				b)    Obter a próxima tarefa da FILA.
		 * */
		
		Stack<String> tarefas = new Stack<>();
		menu(tarefas);

	}
	
	public static void menu(Stack<String> tarefas) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		String tarefa;
		while(op!=3) {
			System.out.println("1-Adicionar tarefa na fila\n2-Obter proxima tarefa\n3-Sair\nOpção: ");
			op = sc.nextInt();
			switch(op) {
			case 1:
				System.out.println("Digite a tarefa: ");
				tarefa = sc.next().toLowerCase();
				tarefas.add(tarefa);
				break;
			case 2:
				if(tarefas.isEmpty()) {
					System.out.println("Lista de tarefas esta vazia");
				} else {
					tarefas.pop();
					System.out.println("Proxima tarefa: "+tarefas.peek());
				}
				break;
			case 3:
				System.out.println("Volte sempre.");
				break;
			default:
				System.out.println("Opção invalida.");
			}
		}
	}

}
