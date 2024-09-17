package exemplos.ex0309construtor;

public class AppTr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangulo0309 tr = new Triangulo0309(3,4,5);
		int pr = tr.perimetro();
		System.out.println("O perimetro é: "+pr);
		
		Triangulo0309 tr1 = new Triangulo0309(4);
		
		System.out.println(tr1);
	}

}
