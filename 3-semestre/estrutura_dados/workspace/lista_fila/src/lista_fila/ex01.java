package lista_fila;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class ex01 {

	public static void main(String[] args) {
		/* 1- Crie um programa em java para gerenciar uma playlist da sua festa em
casa de final de ano. Organize as músicas que deverão ser todas na ordem e
insiram em uma fila.
a) Inserir musica
b) Consultar música
c) Remover música
d) Sair.
		 * */
		Queue<String> playlist = new LinkedList<>();
		menu(playlist);
		System.exit(0);
		
	}
	
	public static void menu(Queue<String> pl) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=4) {
			String menu="""
					1.Inserir musica
					2.Consultar musicas
					3.Remover musica
					4.Sair
					Opção:
					""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: addMusica(pl);
			break;
			case 2: csMusica(pl);
			break;
			case 3: delMusica(pl);
			break;
			case 4: System.out.println("Volte sempre!");
			sc.close();
			break;
			default: System.out.println("Opção invalida");
			}
		}
	}
	
	private static void delMusica(Queue<String> pl) {
		pl.remove();
	}

	private static void csMusica(Queue<String> pl) {
		Iterator<String> it = pl.iterator();
		while(it.hasNext()) {
			System.out.println("Musica: "+it.next());
		}
		
	}

	public static void addMusica(Queue<String> playlist) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua musica: ");
		playlist.add(sc.next());
	} 

}
