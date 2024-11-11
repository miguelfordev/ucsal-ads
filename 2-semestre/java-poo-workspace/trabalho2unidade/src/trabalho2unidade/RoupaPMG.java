package trabalho2unidade;

public class RoupaPMG implements Item{
	
	protected String descricao;
	protected int quantidadeP, quantidadeM, quantidadeG;
	protected int controleEstoqueP, controleEstoqueM, controleEstoqueG;
	protected int estoqueMinimo, estoqueMaximo, controleEstoque;

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo, int estoqueMaximo) {
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	
	public String venda(int item_vendido) {
		if(item_vendido == 1 && quantidadeP >= estoqueMinimo) {
			quantidadeP -= 1;
			return "P - Venda concluida.";
		} else {
			if(item_vendido == 2 && quantidadeM >= estoqueMinimo) {
				quantidadeM -= 1;
				return "M - Venda concluida.";
			} else {
				if(item_vendido == 3 && quantidadeG >= estoqueMinimo) {
					quantidadeG -= 1;
					return "G - Venda concluida.";
				} else {
					return "Não foi possivel concluir a venda.";
				}
			}
		}
	}
	
	public String reposicaoEstoque() {
		if(quantidadeP < estoqueMinimo) {
			quantidadeP = estoqueMaximo;
			controleEstoque += 1;
			controleEstoqueP +=1;
			return "Estoque P reabastecido.";
		} else {
			if(quantidadeM < estoqueMinimo) {
				quantidadeM = estoqueMaximo;
				controleEstoque += 1;
				controleEstoqueM +=1;
				return "Estoque M reabastecido.";
			} else {
				if(quantidadeG < estoqueMinimo) {
					quantidadeG = estoqueMaximo;
					controleEstoque += 1;
					controleEstoqueG +=1;
					return "Estoque G reabestecido.";
				} else {
					return "Não precisou reabastecer o estoque.";
				}
			}
		}
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public int getQuantidade() {
		return this.quantidadeP+this.quantidadeM+this.quantidadeG;
	}
	
	public int getQuantidadeP() {
		return this.quantidadeP;
	}
	
	public int getQuantidadeM() {
		return this.quantidadeM;
	}
	
	public int getQuantidadeG() {
		return this.quantidadeG;
	}
	
	public int getControleEstoque() {
		return this.controleEstoque;
	}
	
	public int getControleEstoqueP() {
		return this.controleEstoqueP;
	}
	
	public int getControleEstoqueM() {
		return this.controleEstoqueM;
	}
	
	public int getControleEstoqueG() {
		return this.controleEstoqueG;
	}
}
