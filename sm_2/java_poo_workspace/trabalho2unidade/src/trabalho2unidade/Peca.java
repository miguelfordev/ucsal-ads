package trabalho2unidade;

public abstract class Peca {

	protected String descricao;
	protected int quantidade;
	protected int estoqueMinimo;
	protected int estoqueMaximo;
	protected int controleEstoque;

	public Peca(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}

	public abstract String venda(int itens_vendidos);
	
	public abstract String reposicaoEstoque();

	public String getDescricao() {
		return descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}
	
	public int getControleEstoque() {
		return controleEstoque;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public void setControleEstoque(int controleEstoque) {
		this.controleEstoque = controleEstoque;
	}
}