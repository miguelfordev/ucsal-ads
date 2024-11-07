package tributaveis;

public class TestaTributavel {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerIR=new GerenciadorDeImpostoDeRenda();
		Conta cp=new ContaPoupanca(2000);
		Tributavel cc=new ContaCorrente(1000);
		SeguroDeVida sv=new SeguroDeVida(10000, 1000);
		System.out.println(cc.calculaTributos());
		System.out.println(sv.calculaTributos());
		gerIR.adicionar(cc);
		gerIR.adicionar(sv);
		System.out.println(gerIR.getTotalTributos());
	}

}