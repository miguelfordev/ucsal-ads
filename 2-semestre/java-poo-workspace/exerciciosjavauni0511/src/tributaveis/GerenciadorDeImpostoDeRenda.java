package tributaveis;

public class GerenciadorDeImpostoDeRenda {
	protected double totalTibrutos=0;
	
	public void adicionar(Tributavel t) {
		this.totalTibrutos+=t.calculaTributos();
	}
	
	public double getTotalTributos() {
		return this.totalTibrutos;
	}
}