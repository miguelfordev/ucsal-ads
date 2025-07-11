package exaulas;
import java.util.Scanner;
public class ex_03_2205 {

	public static void main(String[] args) {
		/* Faca um programa que cadastre um usuario e senha de um aluno. Em seguida o usuario deve 
		 * realizar o login no programa adicione um limite de tentativas.
		 * 
		 * *Dicas: o usuario e senha devem ser armazenado em um vetor;
		 * criticar quando o usuario for digitado errado.-> tente novamente.
		 * criticar quando a senha for digitada errada. -> tente novamente.
		 * */
		loginMenu(cadastrandoUser());
	}
	
	public static void loginMenu(String user[]) {
		//String usuario[] = {"Miguel","123"};
		int tentativas = 4;
		while(tentativas!=0) {
			System.out.printf("Falta %d tentativas.\nLogin: ",tentativas-1);
			String nome = new Scanner(System.in).next();
			System.out.print("Senha: ");
			String senha = new Scanner(System.in).next();
			if(verificarNome(user, nome) && verificarSenha(user, senha)) {
				System.out.print("Login efetuado com sucesso.");
				break;
			} else {
				if (verificarNome(user, nome)) {
					System.out.print("Senha errada.");
				} else {
					if(verificarSenha(user, senha)) {
						System.out.print("Usuario errado.");
					} else {
						System.out.print("Usuario e senha errado.");
						System.out.print("\nTente novamente.\n");
					}
				}
				tentativas --;
			}
		}
	}
	
	public static boolean verificarSenha(String[] user, String senha) {
		if(user[1].equals(senha)) {
			return true;
		}
		return false;
	}
	
	public static boolean verificarNome (String[] user, String nome) {
		if(user[0].equals(nome)) {
			return true;
		}
		return false;
	}

	public static String[] cadastrandoUser() {
		String user[] = new String[2];
		System.out.print("== Cadastrar User ==\nDigite o Login: ");
		user[0] = new Scanner(System.in).next();
		System.out.print("Digite a senha: ");
		user[1] = new Scanner(System.in).next();
		
		return user;
	}
	
}
