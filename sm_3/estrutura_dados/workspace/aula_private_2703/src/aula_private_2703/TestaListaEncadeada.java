package aula_private_2703;

public class TestaListaEncadeada {

	public static void main(String[] args) {
		TestaListaEncadeada testa = new TestaListaEncadeada();
		ListaEncadeada list = new ListaEncadeada();
		
		testa.adicionar(list);
		list.listar();
		list.remover();
		list.listar();
		
		

	}
	
	public void adicionar(ListaEncadeada list) {
		Musica msc1 = new Musica(1,"Asa branca");
		Musica msc2 = new Musica(2,"Aquarela");
		Musica msc3 = new Musica(3,"Chao de giz");
		Musica msc4 = new Musica(4,"Eu caçador de mim");
		
		list.adicionarMusica(msc1);
		list.adicionarMusica(msc2);
		list.adicionarMusica(msc3);
		list.adicionarMusica(msc4);
	}

}
