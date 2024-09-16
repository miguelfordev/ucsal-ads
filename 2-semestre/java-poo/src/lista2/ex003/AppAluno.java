package lista2.ex003;
import java.util.Scanner;
public class AppAluno {

	public static void main(String[] args) {
		Alunos aluno = new Alunos();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do aluno: "); aluno.nome = sc.next();
		System.out.print("Matricula: "); aluno.matricula = sc.nextInt();
		System.out.print("N1, N2 e NT: ");
		aluno.n1 = sc.nextDouble();
		aluno.n2 = sc.nextDouble();
		aluno.nt = sc.nextDouble();
		aluno.mediaFinal();
		if(aluno.notaFinal()==0.0) {
			System.out.print("Aluno: "+aluno.nome+" - Matricula:"+aluno.matricula+" - Media: "+aluno.media+". \nAprovado!");
		} else {
			System.out.print("Aluno: "+aluno.nome+" - Matricula:"+aluno.matricula+" - Media: "+aluno.media+". \nProva Final precisando de: "+aluno.notaFinal());
		}
		

	}

}
