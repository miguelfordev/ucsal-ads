package poligonos;

public class TrianguloRetangulo extends Poligono implements Figura{
	
	public TrianguloRetangulo(int altura, int largura) {
		super(altura, largura);
	}
	
	public double getArea() {
		return this.getAltura()*this.getLargura()/2;
	}
}
