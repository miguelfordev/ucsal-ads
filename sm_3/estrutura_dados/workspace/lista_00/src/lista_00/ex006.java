package lista_00;
import lista_00.ex006_1;
import java.util.Scanner;
public class ex006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ex006_1 pessoa = new ex006_1();

		System.out.print("Digite o nome, altura e sexo(M ou F), nessa ordem: \n");
		pessoa.nome = sc.next();
		pessoa.altura = sc.nextDouble();
		pessoa.sexo = sc.next().toUpperCase().charAt(0);
		
		System.out.println(pessoa.toString());
		System.out.println("Peso Ideal: "+pessoa.pesoIdeal());
	}

}
