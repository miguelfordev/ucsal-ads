package banco;

import java.util.Scanner;

public class AppBanco {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ContaBancaria[] cc=new ContaBancaria[2];
		cc[0]=new ContaCorrente("123", "abc", 500);
		cc[1]=new ContaEspecial("124", "bcd", 500, 1000);
		int opc1, opc2;
		opc1=menu1(cc,sc);
		while(opc1!=cc.length) {
			opc2=menu2(sc);
			switch(opc2){
				case 1: depositar(sc, opc1, cc);
					break;
				case 2: sacar(sc, opc1, cc);
					break;
				case 3: cc[opc1].tiraExtrato();;
					break;
					
			}
			
			opc1=menu1(cc,sc);
		}

	}
	
	public static int menu1(ContaBancaria[] cc, Scanner sc) {
		int opc;
		for(int i=0; i<cc.length; i++) {
			System.out.println(i+" - Numero: "+cc[i].numero+"Saldo: "+cc[i].saldo);
		}
		System.out.println(cc.length+" - Sair");
		System.out.println("Opcao: ");
		opc=sc.nextInt();
		return opc;
	}
	
	public static int menu2(Scanner sc) {
		int opc;
		System.out.println("1 - Depositar\n"
						+ "2 - Sacar\n"
						+ "3 - Extrato");
		System.out.println("Opcao: ");
		opc=sc.nextInt();
		return opc;
	}
	
	public static void depositar(Scanner sc, int opc, ContaBancaria[] cc) {
		double vlr;
		System.out.println("Valor:");
		vlr=sc.nextDouble();
		if(cc[opc].deposita(vlr)) {
			System.out.println("Operacao realizada com sucesso");
		}else {
			System.out.println("A operacao nao pode ser realizada");
		}
		
	}
	
	public static void sacar(Scanner sc, int opc, ContaBancaria[] cc) {
		double vlr;
		System.out.println("Valor:");
		vlr=sc.nextDouble();
		if(cc[opc].saca(vlr)) {
			System.out.println("Operacao realizada com sucesso");
		}else {
			System.out.println("A operacao nao pode ser realizada");
		}
		
	}

}