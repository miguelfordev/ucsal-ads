package atividadeavaliativa_0206;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		Queue<String> contatos = new LinkedList<>();
		menu(contatos);
	}
	
	public static void menu(Queue<String> contatos) {
		Scanner sc = new Scanner(System.in);
		String op = """
				1- Inserir entrevistado
				2- Proximo entrevistado
				3- Sair
				Opção: """;
		int opc=0;
		while(opc!=3) {
			System.out.print(op);
			opc = sc.nextInt();
			switch(opc) {
			case 1:
				System.out.println("Nome do canditato: "); 
				contatos.add(sc.next());
				break;
			case 2:
				System.out.println("Candidato do inicio da fila: "+contatos.peek());
				contatos.remove();
				System.out.println("Proximo candidtato: "+contatos.peek());
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
