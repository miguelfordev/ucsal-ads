package exemplos.ex1009.series;

public class ProgressaoGeometrica {

	private int primeiroTermo = 2;
	private int razao = 3;
	private int termoAtual = primeiroTermo;
	
	public int prxTermo() {
		this.termoAtual = this.termoAtual * this.razao;
		return this.termoAtual;
	}
}
