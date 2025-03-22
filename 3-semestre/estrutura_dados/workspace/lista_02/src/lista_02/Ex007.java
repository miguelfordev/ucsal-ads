package lista_02;

public class Ex007 {

	public static void main(String[] args) {
		/*7 – Escreva uma função recursiva que determine se uma string é um
palíndromo. A função deve ignorar espaços e diferenças entre maiúsculas e
minúsculas.*/
		
		System.out.println(palin("arara"));

	}
	
	public static String palin(String palvra) {
        palvra = palvra.replaceAll("\\s", "").toLowerCase();
        if(verPalin(palvra, 0, palvra.length() - 1)) {
        	return "É palindromo";
        } else {
        	return "Não é palindromo";
        }
    }

    private static boolean verPalin(String palvra, int ini_palavra, int fim_palavra) {
        if (ini_palavra >= fim_palavra) {
        	return true;        	
        } else if (palvra.charAt(ini_palavra) != palvra.charAt(fim_palavra)) { 
        	return false;
        } else {
        	return verPalin(palvra, ini_palavra + 1, fim_palavra - 1);        	
        }
 
    }

}
