package exaulas;
import java.util.Scanner;
public class ex013 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n,qtd=0,par=0,impar=0,qtdnumeros=0;
		float mediaimpar=0;
		do {
			System.out.print("Digite um número: ");
			n = scan.nextInt();
			if(n%2==0) {
				par = par + n;
				qtd = qtd + 1;
			} else {
				impar = impar + n;
				qtdnumeros = qtdnumeros + 1;
			}
		
		} while(qtd<=9);
		mediaimpar = impar/qtdnumeros;
		
		System.out.println("A soma dos números pares são: "+par);
		System.out.print("A média dos números impares são: "+mediaimpar);
		
		scan.close();
		
	}

}
