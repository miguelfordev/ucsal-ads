package exaulas;
import java.util.Scanner;
public class ex010 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,v1,v2=0;
		
		System.out.print("Digite um numero: ");
		n = scan.nextInt();
		
		while(true) {
			System.out.print("Digite outro numero: ");
			v1 = scan.nextInt();
			scan.close();
			if(n == (v1+v2)) {
				break;
			};
			v2 = v1;
		}
		
		
		

	}

}
