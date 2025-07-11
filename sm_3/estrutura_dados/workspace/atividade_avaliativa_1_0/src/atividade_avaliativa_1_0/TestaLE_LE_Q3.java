package atividade_avaliativa_1_0;
import java.util.Scanner;
public class TestaLE_LE_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ListaEncadeada_LE_Q3<Integer> list = new ListaEncadeada_LE_Q3<>();
		
		for(int i=0;i<10;i++) {
			Numero_LE_Q3<Integer> valor = new Numero_LE_Q3<>();
			System.out.println("Digite um numero: ");
			int n = sc.nextInt();
			valor.setValor(n);
			list.adicionar(valor);
		}
		list.updateLista(); // A gambiarra está aqui. >D
		list.listar();
		list.remover();
		System.out.println();
		list.listar();
		list.remover();
		System.out.println();
		list.listar();
		
		
		//Testando o generics = acho que deu errado
		/*ListaEncadeada_LE_Q3<String> list2 = new ListaEncadeada_LE_Q3<>();
		Numero_LE_Q3<String> nome = new Numero_LE_Q3<>();
		nome.setValor("Miguel");
		list2.adicionar(nome);
		list2.listar();*/
	
		sc.close();
	}

}
