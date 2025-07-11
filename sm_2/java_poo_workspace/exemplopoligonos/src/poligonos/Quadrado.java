package poligonos;

public class Quadrado implements Figura{
	int lado;
	
	public Quadrado(int lado) {
		this.lado=lado;
	}
	
	public double getArea() {
		return this.lado*this.lado;
	}
}
