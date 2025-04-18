package alison;

import java.util.Scanner;

public class Turma {
	
	private String disciplina;
	private String professor;
	private int cargaHoraria;
	private int quantidadeDeAlunos;
	Alunos[] vAlunos = new Alunos[30];
	
	public void menu() {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		while(op!=7) {
			String menu = """ 
					--- MENU ---
					1. Inserir aluno
					2. Inserir nota 1
					3. Inserir nota 2
					4. Inserir nota do trabalho
					5. Calcular media
					6. Mostrar listar
					7. Sair
					""";
			System.out.println(menu);
			op = sc.nextInt();
			switch(op) {
			case 1: insereAluno();
					break;
			case 2: System.out.println("Digite a matricula do aluno: ");
					int matricula = sc.nextInt();
					inserirNota1(matricula);
					break;
			case 7: System.out.println("Volte sempre.");
					break;
			default: System.out.println("Opção invalida.");
					break;
			}
		}
	}

	public void insereAluno() {
		Alunos al = new Alunos();
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<vAlunos.length;i++) {
			if(vAlunos[i]==null) {
				System.out.println("Matricula, nome, nota1, nota2, notaT: ");
				al.setMatricula(sc.nextInt());
				al.setNome(sc.next());
				vAlunos[i]=al;
				break;
			} 	
		}
		
	}

	public void inserirNota1(int matricula) {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<vAlunos.length;i++) {
			if(vAlunos[i] != null) {
				if(vAlunos[i].getMatricula()==matricula) {
					System.out.println("Digite nota: ");
					vAlunos[i].setNota1(sc.nextDouble());
					break;
				}
			}
		}
		
	}
	
	public void verAlunos() {
		for(int i=0;i<vAlunos.length;i++) {
			if(vAlunos[i]!=null) {
				System.out.println(vAlunos[i].getMatricula()+" - Nome:"+vAlunos[i].getNome());
			}
		}
	}

}