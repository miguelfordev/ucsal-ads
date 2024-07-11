package questoeslista;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome,letra;
		int i,rep=0;
		
		System.out.print("Digite a plavra: ");
		nome = sc.next();
		System.out.print("Digite a letra para saber quantas vezes ela se repete: ");
		letra = sc.next();
		sc.close();
		
		
		for (i=0;i<nome.length();i++) {
			if(nome.toUpperCase().charAt(i) == letra.toUpperCase().charAt(0)) {
				rep += 1;
			}
		}
		
		System.out.print("A letra: "+letra.toUpperCase()+" se repetiu: "+rep+" vezes.");
		
	}

}
