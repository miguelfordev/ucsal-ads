import java.util.Scanner;

import conta.CriarConta;
import conta.Login;
import conta.Operacoes;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean executando = true;

        while (executando) {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Fazer Login");
            System.out.println("3 - Consultar Clientes e Contas");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    CriarConta.executar(scanner);
                    break;
                case 2:
                    Login.executar(scanner);
                    break;
                case 3:
                	Operacoes.consultarClientesEContas();
                	break;
                case 4:
                    executando = false;
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
