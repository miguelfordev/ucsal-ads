package atv_fila;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;

public class atv_queue {

	public static void main(String[] args) {
		/*Faça um programa em java que receba os nomes dos professores 
		 * e armazene em uma estrutura de fila. 
		 * Apresente: tamanho da fila, o primeiro da fila, liste toda fila
		 *  e por fim faça a remoção de um elemento. 
		 *  Para verificar se o elemento da fila foi removido,
		 *   execute novamente a impressão dos elementos da fila.*/

		Queue<String> fila = new LinkedList<>();
		fila.add("Angela");
		fila.add("Chris");
		fila.add("Marco");
		fila.add("Elton");
		System.out.println("Tamanho da fila: "+fila.size());
		System.out.println("O primeiro da fila: "+fila.peek());
		System.out.println("Fila completa.");
		Iterator<String> it = fila.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Removendo um elemento da fila");
		fila.remove();
		System.out.println("Fila completa com elemento removido.");
		Iterator<String> it2 = fila.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
	}

}
