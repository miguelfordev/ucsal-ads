package poligonos;

public abstract class Poligono {
	protected int altura;
	protected int largura;
	
	public Poligono(int altura, int	largura) {
		this.altura = altura;
		this.largura = largura;
	}
	
	public int getAltura() {
		return	this.altura;
	}
	
	public int getLargura() {
		return this.largura;
	}
	
	public abstract double getArea();
	
}