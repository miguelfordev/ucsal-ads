package lista2.ex001;
import java.util.Scanner;

import lista2.ex001.ProgressaoAritmetica;
public class TestandoClasse {

	public static void main(String[] args) {
		ProgressaoAritmetica teste = new ProgressaoAritmetica();
		Scanner sc = new Scanner(System.in);
		
		System.out.print(teste.proximoTermo());
	}

}
