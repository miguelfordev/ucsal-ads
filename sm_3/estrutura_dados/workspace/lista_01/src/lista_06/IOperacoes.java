package lista_06;

public interface IOperacoes {

	String adicionar_contato(String nome, int num);
	String excluir_contato(String nome, int num);
	String atualizar_contato(String nome, int num);
	String remover_contato(String nome, int num);
}
