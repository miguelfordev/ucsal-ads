package lista_02;

public class Ex013 {

	public static void main(String[] args) {
		/*13 - Escreva um método recursivo que determine quantas vezes um
determinado caractere aparece em uma string. */

		System.out.println(contaChar("paralelepipedo",'k'));
	}
	
	public static int contaChar(String str, char car) {
		if(str.isEmpty()) {
			return 0;
		} else {
			return (str.charAt(0) == car ? 1:0) + contaChar(str.substring(1), car);
		}
	}

}
