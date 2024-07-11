package exaulas;
import java.util.Scanner;
public class ex022mod {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int v1,v2,v3, maiorT;
		
		System.out.print("Digite um valor: ");
		v1 = sc.nextInt();
		v2 = sc.nextInt();
		v3 = sc.nextInt();
		maiorT = maior(v1,v2,v3);
		
		System.out.println("O maior número digitado foi: "+maiorT);
		sc.close();
	}

	public static int maior(int a, int b, int c) {
		int maior;
		maior=0;
		if(a>b && a>c) {
			maior = a;
		} else {
			if(b>a && b>c) {
				maior = b;
			} else {
				maior = c;					
			}
		}
		return maior;
	}
}
