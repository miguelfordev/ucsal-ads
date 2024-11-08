package trabalho2unidade;

public interface Item {
	String venda(int itens_vendidos);
	String reposicaoEstoque();
	String getDescricao();
	int getQuantidade();
	int getControleEstoque();
}
