package lista3.ex003;
import java.util.Scanner;
public class AppAlunos {

	public static void main(String[] args) {
		Alunos[] alunos = new Alunos[3];
		int mat;
		String nome;
		double n1,n2,tr;
		for(int i=0;i<alunos.length;i++) {
			System.out.print("Aluno: ");
			Alunos aluno = new Alunos();
			mat = new Scanner(System.in).nextInt();
			nome = new Scanner(System.in).next();
			n1 = new Scanner(System.in).nextDouble();
			n2 = new Scanner(System.in).nextDouble();
			tr = new Scanner(System.in).nextDouble();
			aluno.setAluno(mat, nome, n1, n2, tr);
			aluno.media();
			alunos[i] = aluno;
		}

		for(int i=0;i<alunos.length;i++) {
			System.out.print(alunos[i].toString());
			System.out.println();
			if(alunos[i].provafinal()==1) {
				System.out.println("O aluno: "+alunos[i].getNome()+" foi para final com media: "+alunos[i].media());
			}
		}
	}

}
