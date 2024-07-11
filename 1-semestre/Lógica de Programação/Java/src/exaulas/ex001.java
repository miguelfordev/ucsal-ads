package exaulas;
import java.util.Scanner;
public class ex001 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nome;
		System.out.print("-Oi, sou Computalino. E você? ");
		nome = scan.nextLine();
		System.out.println("-Bonito nome, "+nome+"!");
		
		scan.close();
	}

}
