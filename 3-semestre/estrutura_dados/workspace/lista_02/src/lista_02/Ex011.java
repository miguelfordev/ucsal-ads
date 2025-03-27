package lista_02;

public class Ex011 {

	public static void main(String[] args) {
		/*11 – Escreva um método recursivo que inverta uma string.*/

		System.out.println(inveString("nao"));
	}
	
	public static String inveString(String str) {
		if(str.isEmpty()) {
			return str;
		} else {
			return inveString(str.substring(1)) + str.charAt(0);
		}
	}

}
