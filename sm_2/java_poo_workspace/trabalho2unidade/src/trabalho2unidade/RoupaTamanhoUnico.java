package trabalho2unidade;

public class RoupaTamanhoUnico extends Peca implements Item{

	public RoupaTamanhoUnico(String descricao, int quantidade, int estoqueMinimo, int estoqueMaximo ) {
		super(descricao, quantidade, estoqueMinimo, estoqueMaximo);
	}
	
	public String venda(int itens_vendidos) {
		if(itens_vendidos > 0) {
			quantidade -= itens_vendidos;
			return "Venda concluida.";
		} else {
			return "Não foi possivel concluir a venda por falta de estoque.";
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