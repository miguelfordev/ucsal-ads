package questoes;
import java.util.Scanner;
public class ex003 {

	public static void main(String[] args) {
		/* 3) Faça um programa que receba dois números e descubra seu MMC. A identificação do 
			MMC deve ser feita dentro de uma função que retorne tal valor. A leitura e a escrita dos 
			dados, além da ativação do módulo MMC, devem ficar na função principal. */
		
		Scanner sc = new Scanner(System.in);
		
		int n1,n2,res;
		System.out.print("Número 1: ");
		n1 = sc.nextInt();
		System.out.print("Número 2: ");
		n2 = sc.nextInt();
		res = mmc(n1,n2);
		System.out.printf("O MMC é: %d",res);
		sc.close();
	}
	
	public static int mmc(int n1, int n2) {
		int mmc=0,n3;
		if(n2>n1) {
			n3 = n2;
			n2 = n1;
			n1 = n3;
		}
		if (n1>n2) {
			mmc = n1;
			while (true) {
	            if (mmc % n1 == 0 && mmc % n2 == 0) {
	                break;
	            }
	            mmc++;
	        }
		}
		return mmc;
	}

}
