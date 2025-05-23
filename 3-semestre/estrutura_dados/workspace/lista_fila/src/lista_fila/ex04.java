package lista_fila;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		/*4- Crie um programa em java para gerenciar a fila de uma sala de aula,
onde deverá está ordenada por idade
a) Inserir alunos
b) Consultar alunos
c) Sair.
		 * */
		PriorityQueue<Aluno> fila = new PriorityQueue<>(Comparator.comparingInt(Aluno::getIdade).reversed());
		menu(fila);
	}

	public static void menu(Queue<Aluno> fl) {
		int op=0;
		Scanner sc = new Scanner(System.in);
		while(op!=3) {
			String menu="""
					1.Inserir aluno
					2.Constultar aluno
					3.Sair
					Opção:""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: addAl(fl);
			break;
			case 2: cslAl(fl);
			break;
			case 3: System.out.println("Tchau!");
			break;
			default: System.out.println("Opção invalida");
			}
		}
	}

	private static void cslAl(Queue<Aluno> fl) {
		while(!fl.isEmpty()) {
			Aluno al = fl.poll();
			System.out.println("Nome: "+al.getNome()+" Idade: "+al.getIdade());
		}
	}

	private static void addAl(Queue<Aluno> fl) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de alunos: ");
		int qtd = sc.nextInt();
		for(int i=0;i<qtd;i++) {
			Aluno al = new Aluno();
			System.out.println("Digite o nome do aluno e em seguida a idade dele: ");
			al.setNome(sc.next());
			al.setIdade(sc.nextInt());
			fl.add(al);			
		}
	}

}
