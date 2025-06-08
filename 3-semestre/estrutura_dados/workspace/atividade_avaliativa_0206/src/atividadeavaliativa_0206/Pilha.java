package atividadeavaliativa_0206;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		Stack<String> sços = new Stack<>();
		menu(sços);
		

	}

	private static void menu(Stack<String> sços) {
		Scanner sc = new Scanner(System.in);
		String op = """
				1- Inserir serviço na pilha
				2- Obter proximo serviço na pilha
				3- Sair
				Opção: """;
		int opc=0;
		while(opc!=3) {
			System.out.print(op);
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Nome do serviço: ");
				String nome = sc.next();
				sços.push(nome);
				break;
			case 2:
				System.out.println("Serviço concluido/cancelado: "+sços.peek());
				sços.pop();
				if(sços.empty()) {
					System.out.println("Pilha está vazia/concluida.");
				} else {
					System.out.println("Proximo serviço: "+sços.peek());					
				}
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
