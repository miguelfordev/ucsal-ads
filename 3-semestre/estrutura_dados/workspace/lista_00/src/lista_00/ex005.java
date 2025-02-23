package lista_00;

import java.util.Scanner;

public class ex005 {

	public static void main(String[] args) {
		String[] estoque = new String[4];
		add(estoque);
		double media = md(estoque);
		System.out.println("A média do estoque de "+estoque[0]+" é: "+media);
	}
	
	public static void add(String[] vt) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do produto, qtd min e qtd max, nessa ordem:");
		vt[0] = sc.next();
		vt[1] = sc.next();
		vt[2] = sc.next();
	}
	
	public static double md(String[] vt) {
		double media;
		media = (Double.parseDouble(vt[1])+Double.parseDouble(vt[2]))/2;
		return media;
	}

}
