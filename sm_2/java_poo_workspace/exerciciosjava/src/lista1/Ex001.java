package lista1;
import java.util.Scanner;
public class Ex001 {

	public static void main(String[] args) {
		/* 1) Faça um programa em Java que receba uma temperatura em centígrados e transforme para fahrenheit.
		Sabe-se que a fórmula para conversão é F=((9.C)+160)/5.*/
		
		Scanner scan = new Scanner(System.in);
		
		double temp;
		System.out.print("Digite a temperatura: ");
		temp = scan.nextDouble();
		
		
		double resultado = calculoF(temp);
		System.out.print(resultado);
	}
	
	public static double calculoF(double graus) {
		
		double F;
		F=(((9*graus)+160)/5);
		return F;
	}
	
}
