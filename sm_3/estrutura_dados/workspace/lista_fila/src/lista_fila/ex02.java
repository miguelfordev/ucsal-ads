package lista_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		/* 2- Implemente um programa que contemple uma fila de contatos para um
callcenter. As opções do programa devem ser:
a) Inserir Contato: Deve solicitar ao usuário os dados e incluir o contato na
fila;
b) Próximo Contato: Deverá pegar o Contato do Início da Fila, removê-lo e
mostrar os seus dados na tela para o usuário efetuar o contato com o
cliente.
c) Sair.
		 * */
		Queue<String> contatos = new LinkedList<>();
		menu(contatos);
	}

	public static void menu(Queue<String> fl) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=3) {
			String menu="""
					1.Inserir contato
					2.Proximo contato
					3.Sair
					Opção:""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: addct(fl);
			break;
			case 2: prxct(fl);
			break;
			case 3: System.out.println("Tchau!");
			break;
			default: System.out.println("Opção invalida");
			}
		}
	}

	private static void prxct(Queue<String> fl) {
		fl.remove();
		System.out.println("Contato: "+fl.peek());
		
	}

	private static void addct(Queue<String> fl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nome contato: ");
		fl.add(sc.next());
		
	}
	
	

}
