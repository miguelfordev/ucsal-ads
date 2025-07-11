package lista_00;
import java.util.Scanner;
import lista_00.ex011_1;
public class ex011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex011_1 aluno = new ex011_1();

		System.out.println("Digite nome do aluno, n1,n2,n3. Nessa ordem: ");
		aluno.nome = sc.next();
		aluno.n1 = sc.nextDouble(); aluno.n2 = sc.nextDouble(); aluno.n3 = sc.nextDouble();
		
		System.out.println("A média do aluno "+aluno.nome+" é: "+aluno.Media());
	}

}
