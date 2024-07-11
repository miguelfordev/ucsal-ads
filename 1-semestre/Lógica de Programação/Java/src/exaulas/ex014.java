package exaulas;
import java.util.Scanner;
public class ex014 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n,i;
		System.out.print("Digite um numero: ");
		n = sc.nextInt();
		sc.close();
		
		for(i=0;i<=n;i++) {
			System.out.print(i+"|");
		}
		

	}

}
