package lista1;
import java.util.Scanner;
public class Ex002 {

	public static void main(String[] args) {
		/* 2) Faça um programa em Java que solicite a hora atual (expressa em horas, minutos e segundos) ao usuário e
informe quantos segundos do dia já passaram. */

		int h,m,s;
		System.out.print("Digite a hora atual, os minutos e os segundos em sequencia: ");
		h = new Scanner(System.in).nextInt()*3600;
		m = new Scanner(System.in).nextInt()*60;
		s = new Scanner(System.in).nextInt();
		
		System.out.print("Já se passaram "+(h+m+s)+" segundos do dia.");
		
	}

}
