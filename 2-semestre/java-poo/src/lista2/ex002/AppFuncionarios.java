package lista2.ex002;
import java.util.Scanner;
public class AppFuncionarios {

	public static void main(String[] args) {
		Funcionario[] vetorfunc = new Funcionario[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<vetorfunc.length;i++) {
			vetorfunc[i] = new Funcionario();
			System.out.print("Nome: "); vetorfunc[i].nome = sc.next();
			System.out.print("Salario: ");  vetorfunc[i].salario = sc.nextDouble();
		}

		for(int i=0;i<vetorfunc.length;i++) {
			vetorfunc[i].ajustaSalario();
			System.out.println(vetorfunc[i].nome+" - "
					+vetorfunc[i].salario);
		}
	}

}
