package exaulas;
import java.util.Scanner;
public class ex009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,i,div=0;
		
		System.out.print("Digite um número: ");
		n = scan.nextInt();
		scan.close();
		
		for(i=1;i<=n;i++) {
			if(n%i==0) {
				div = div + 1;
			}	
		}
		
		if(div==2) {
			System.out.println("É primo");
		} else {
			System.out.println("Não é primo");
		}
	}

}
