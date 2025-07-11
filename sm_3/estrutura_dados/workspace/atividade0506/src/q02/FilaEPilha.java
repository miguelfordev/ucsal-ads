package q02;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class FilaEPilha {

	public static void main(String[] args) {
		/*2 -  Dada uma fila simplesmente encadeada F e uma pilha encadeada P, 
		 * construa um programa para ler uma série de nome dos carros e o seu fabricante.
		 *  Se o fabricante for Toyota(T) deverá ser inserido em uma Pilha. 
		 *  Para qualquer outro fabricante (GM,  Fiat, VW) deverá ser inserido em uma fila; 
		 *  - O usuário poderá: 
		 *  I - inserir um novo carro,    
		 *  F – Listar a fila,    
		 *  P – Listar a Pilha e    
		 * S – Sair do programa.
		 * */
		
		Stack<String> pilha = new Stack<>();
		Queue<String> fila = new LinkedList<>();
		menu(pilha, fila);

		
	}
	
	public static void menu(Stack<String> pilha, Queue<String> fila) {
		Scanner sc = new Scanner(System.in);
		char op='x', fabricante=' ';
		String nome="";
		while(op!='S') {
			String menuzin =	"""
					MENU
					I - inserir um novo carro
					F - listar a fila
					P - listar a pilha
					S - sair do programa
					Opção:
					""";
			System.out.println(menuzin);
			op = sc.next().toUpperCase().charAt(0);
			switch(op) {
			case 'I':
				System.out.println("Digite um nome de carro: ");
				nome = sc.next().toLowerCase();
				System.out.println("Digite a fabricante: ");
				fabricante = sc.next().toUpperCase().charAt(0);
				if(fabricante == 'T') {
					pilha.push(nome);
					System.out.println("Carro da Toyota adicionado com sucesso.");
				} else {
					fila.add(nome);
					System.out.println("Carro de marca diferente adicionado.");
					
				}
				break;
			case 'F': 
				Iterator<String> it = fila.iterator();
				while(it.hasNext()) {
					System.out.println(it.next()+" ");
				}
				break;
			case 'P':
				Iterator<String> it2 = pilha.iterator();
				while(it2.hasNext()) {
					System.out.println(it2.next()+" ");
				}
				break;
			case 'S':
				System.out.println("Volte sempre.");
				break;
			default:
				System.out.println("Opção invalida.");	
			}
		}
	}

}
