package aula_2003_lista_encadeada;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		TestaListaEncadeada testaListaEncadeada = new TestaListaEncadeada();
		ListaEncadeada listaEncadeada = new ListaEncadeada();
		
		testaListaEncadeada.addContato(listaEncadeada);
		System.out.println("Todos os contatos foram adicionados");
		
		//se quiser testar o metodo temproximo 
		System.out.println("Os contatos são: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}
		
		testaListaEncadeada.delContato(listaEncadeada);
		System.out.println("Os contatos agora são: ");
		while(listaEncadeada.temProximo()) {
			System.out.println(listaEncadeada.getPosicaoAtual().getValor().getNome());
		}

	}
	
	public void delContato(ListaEncadeada listaEncadeada) {
		Contato contato9 = new Contato(9, "PEDRO", "pedro@ucsal.br");
		listaEncadeada.remover(contato9);
	}
	
	public void addContato(ListaEncadeada listaEncadeada) {
		Contato contato1 = new Contato(1, "DERIC", "deric@ucsal.br");
		Contato contato2 = new Contato(2, "DIEGO", "diego@ucsal.br");
		Contato contato3 = new Contato(3, "ISABEL", "isabel@ucsal.br");
		Contato contato4 = new Contato(4, "ARTHUR", "arthur@ucsal.br");
		Contato contato5 = new Contato(5, "MIGUEL", "miguel@ucsal.br");
		Contato contato6 = new Contato(6, "ANDERSON", "anserson@ucsal.br");
		Contato contato7 = new Contato(7, "VITOR", "vitor@ucsal.br");
		Contato contato8 = new Contato(8, "RODRIGO", "rodrigo@ucsal.br");
		Contato contato9 = new Contato(9, "PEDRO", "pedro@ucsal.br");
		
		//a prof explicou que cada contato tem q apontar para o prox contato
		
		listaEncadeada.adicionar(contato1);//|DERIC||-->
		listaEncadeada.adicionar(contato2);//|DERIC||-->|DIEGO||-->
		listaEncadeada.adicionar(contato3);//|DERIC||-->|DIEGO||-->|ISABEL||-->
		listaEncadeada.adicionar(contato4);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->
		listaEncadeada.adicionar(contato5);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->|MIGUEL||
		listaEncadeada.adicionar(contato6);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->|MIGUEL||-->|ANDERSON||-->
		listaEncadeada.adicionar(contato7);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->|MIGUEL||-->|ANDERSON||-->|VITOR||-->
		listaEncadeada.adicionar(contato8);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->|MIGUEL||-->|ANDERSON||-->|VITOR||-->|RODRIGO||-->
		listaEncadeada.adicionar(contato9);//|DERIC||-->|DIEGO||-->|ISABEL||-->|ARTHUR||-->|MIGUEL||-->|ANDERSON||-->|VITOR||-->|RODRIGO||-->|PEDRO||-->

	}

}
