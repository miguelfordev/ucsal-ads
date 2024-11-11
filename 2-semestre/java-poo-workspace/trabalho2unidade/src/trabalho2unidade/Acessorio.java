package trabalho2unidade;

public class Acessorio extends Peca implements Item{
	
	public Acessorio(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo ) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}
	
	public String venda(int itens_vendidos) {
		if(itens_vendidos <= quantidade && quantidade >= estoqueMinimo || quantidade == itens_vendidos) {
			quantidade -= itens_vendidos;
			return "Venda concluida.";
		} else {
			return "Não foi possivel concluir a venda por falta de estoque suficiente.";
		}
	}
	
	public String reposicaoEstoque() {
		if(quantidade < estoqueMinimo) {
			quantidade = estoqueMaximo;
			controleEstoque += 1;
			return "Estoque reabastecido.";			
		} else {
			return "Não precisou reebastecer estoque.";
		}
	}
}