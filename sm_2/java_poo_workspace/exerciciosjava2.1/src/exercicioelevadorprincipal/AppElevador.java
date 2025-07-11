package exercicioelevadorprincipal;
import exercicioelevador.Elevador;
import java.util.Random;
public class AppElevador {

	public static void main(String[] args) {
		Elevador elv=new Elevador(3, 5);
		Random rand=new Random();
		int qtdPessoasEntrar, qtdPessoasSair;
		
		for(int i=0; i<=3; i++) {
			System.out.println("Andar: "+ elv.getAndarAtual()+" - Pessoas: "+elv.getQuantidadePessoas());
			qtdPessoasSair=rand.nextInt(elv.getQuantidadePessoas()+1);
			qtdPessoasEntrar=rand.nextInt(elv.getCapacidade());
			System.out.println(qtdPessoasSair+" - "+qtdPessoasEntrar);
			for(int j=1; j<=qtdPessoasSair; j++) {
				elv.sai();
			}
			for(int j=1; j<=qtdPessoasEntrar; j++) {
				elv.entra();
			}
			System.out.println("Andar: "+ elv.getAndarAtual()+" - Pessoas: "+elv.getQuantidadePessoas());
			elv.sobe();
		}
	}

}
