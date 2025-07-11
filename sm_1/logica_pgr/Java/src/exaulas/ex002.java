/*package exaulas;
import java.util.Scanner;
public class ex002 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int ano,mes,dia, idade,r1,r2,r3;
		int anoA=2024,mesA=4,diaA=23;
		
		System.out.print("Digite o ano de nascimento: ");
		ano = scan.nextInt();
		System.out.print("Digite o mes de nascimento: ");
		mes = scan.nextInt();
		System.out.print("Digite o dia de nascimento: ");
		dia = scan.nextInt();
		
		if(anoA>=ano || 1>=mes && mes<=12 || 1>=dia && dia<=30) {
			idade = anoA - ano;
			if(mesA>mes && diaA>dia || mesA==mes && diaA>=dia) {
				r1 = idade*365;
			} else {
				if(mesA<mes && diaA<dia || mesA==mes && diaA<dia) {
					r1 = (idade-1)*365;
				} else {
					
				}
			}
		}
			
			
		scan.close();
	
	}

}*/


