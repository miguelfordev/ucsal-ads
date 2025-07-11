package lista4.ex001;

public class Retangulo {
	private int x;
	private int y;
	private int altura;
	private int largura;
	
	public Retangulo(int x, int y, int alt, int larg) {
		this.x=x;
		this.y=y;
		this.altura=alt;
		this.largura=larg;
	}
	
	public int perimetro() {
		return 2*this.altura+2*this.largura;
	}
	
	public int area() {
		return this.altura*this.largura;
	}
}
