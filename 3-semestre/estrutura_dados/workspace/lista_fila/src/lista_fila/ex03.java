package lista_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		/* 3- Crie um programa em java para gerenciar a fila de supermercado:
a) Inserir cliente
b) Remover cliente
c) Consultar quantos clientes tem na fila
d) Sair.
		 * */
		Queue<String> mc = new LinkedList<>();
		menu(mc);
	}
	
	public static void menu(Queue<String> fl) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=4) {
			String menu="""
					1.Inserir cliente
					2.Remover cliente
					3.Consultar clientes
					4.Sair
					Opção:
					""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: addCl(fl);
			break;
			case 2: delCl(fl);
			break;
			case 3: cslCl(fl);
			break;
			case 4: System.out.println("Volte sempre!");
			sc.close();
			break;
			default: System.out.println("Opção invalida");
			}
		}
	}

	private static void cslCl(Queue<String> fl) {
		System.out.println("Total clientes: "+fl.size());
		
	}

	private static void delCl(Queue<String> fl) {
		fl.remove();
		
	}

	private static void addCl(Queue<String> fl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Add cliente: ");
		fl.add(sc.next());
		
	}

}
