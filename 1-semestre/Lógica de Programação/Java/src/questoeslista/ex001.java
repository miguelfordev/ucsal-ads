package questoeslista;
import java.util.Scanner;
public class ex001 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nome;
		System.out.println("Digite um nome: ");
		nome = scan.nextLine();
		scan.close();
		
		System.out.println(nome);

	}

}
