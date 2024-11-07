package tributaveis;

public class SeguroDeVida implements Tributavel{
	protected double valorSegurado;
	protected double fraquia;

	public SeguroDeVida(double vlrSeg, double franq) {
		this.valorSegurado=vlrSeg;
		this.fraquia=franq;
	}
	
	public double calculaTributos() {
		return 42;
	}
	
}