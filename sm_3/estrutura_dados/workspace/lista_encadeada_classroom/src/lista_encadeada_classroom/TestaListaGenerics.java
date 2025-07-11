package lista_encadeada_classroom;
import java.util.Scanner;
public class TestaListaGenerics {

	public static void main(String[] args) {
		//Questão 1: 
		ListaEncadeada<String> nomeProf = new ListaEncadeada<>();
		nomeProf.addD("Angela");
		nomeProf.addE("Chris");
		nomeProf.delD();
		nomeProf.delE();
		System.out.println(nomeProf.getVazio());
		nomeProf.apagarLista();
		nomeProf.listar();
		
		//Questão 2:
		ListaEncadeada<Integer> matAluno = new ListaEncadeada<>();
		matAluno.addD(200031818);
		matAluno.addE(200031717);
		matAluno.delD();
		matAluno.delE();
		matAluno.pesquisar(200031818);
		matAluno.listar();
		//matAluno.ordernar() -> Não consegui fazer por que não consegui resolver a comparação.
		
		//Questão 3:
		ListaEncadeada<Integer> numInt = new ListaEncadeada<>();
		Scanner sc = new Scanner(System.in);
		int num=0;
		for(int i=0;i<3;i++) {
			System.out.println("Numero "+(i+1)+":");
			num = sc.nextInt();
			numInt.addD(num);
		}
		numInt.pesquisar(7);
		numInt.pesquisar(70); 
		
		//Questão 4:
		if(numInt.buscaR(7)!=null) {
			System.out.println("Valor encontrado");
		} else {
			System.out.println("Valor não encontrado");
		}
		
		//Questão 5
		ListaEncadeada<Integer> numInt2 = new ListaEncadeada<>();
		int num2=0;
		for(int i=0;i<7;i++) {
			System.out.println("Numero "+(i+1)+":");
			num2=sc.nextInt();
			numInt2.addDMax7(num2);
		}
		numInt2.addDMax7(8);
		numInt2.listar();
		
		sc.close();
		System.exit(0);
		
	}

}
