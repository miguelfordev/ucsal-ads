package lista_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		/*5- Escreva um programa em java utilizando pilhas, que apresente as
seguintes opções no menu:
a) Inserir Paciente
b) Atender paciente
c) Verificar se há paciente
d) Indicar o próximo paciente a ser atendido
e) Quantidade de pacientes que aguardam atendimento
f) Sair
		 * */
		Queue<String> ltpac = new LinkedList<>();
		menu(ltpac);
	}

	public static void menu(Queue<String> fl) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=6) {
			String menu="""
					1) Inserir Paciente
2) Atender paciente
3) Verificar se há paciente
4) Indicar o próximo paciente a ser atendido
5) Quantidade de pacientes que aguardam atendimento
6) Sair
					Opção:""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: addpc(fl);
			break;
			case 2: atdpct(fl);
			break;
			case 3: verpct(fl);
			break;
			case 4: indpct(fl);
			break;
			case 5: qtdpct(fl);
			break;
			case 6: System.out.println("Encerrado");
			break;
			default: System.out.println("Opção invalida");
			}
		}
	}

	private static void qtdpct(Queue<String> fl) {
		System.out.println("Quantidade de pacientes cadastrados: "+fl.size());
		
	}

	private static void indpct(Queue<String> fl) {
		fl.remove();
		System.out.println("Proximo paciente a ser atendido: "+fl.peek());
		
	}

	private static void verpct(Queue<String> fl) {
		if(fl.isEmpty()) {
			System.out.println("A fila de paciente está vazia.");
		} else {
			System.out.println("Existe paciente na fila e ele é: "+fl.peek());
		}
		
	}

	private static void atdpct(Queue<String> fl) {
		System.out.println("Paciente do inicio da fila: "+fl.peek());
		
	}

	private static void addpc(Queue<String> fl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do paciente: ");
		fl.add(sc.nextLine());
		
	}

}
