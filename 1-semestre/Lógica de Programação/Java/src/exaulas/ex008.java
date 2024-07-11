package exaulas;
import java.util.Scanner;
public class ex008 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,soma=0;
		
		while(true) {
			System.out.print("Digite um numero: ");
			n = scan.nextInt();
			if(n==-1) {
				break;
			};
			soma = soma+n;
		}
		
		System.out.println("A soma é: "+soma);
		scan.close();
	}

}
