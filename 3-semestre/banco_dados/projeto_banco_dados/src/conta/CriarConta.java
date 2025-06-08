package conta;

import db.Conexao;
import java.sql.*;
import java.util.Scanner;

public class CriarConta {
	
    public static void executar(Scanner scanner) {
        
    	try (Connection conn = Conexao.conectar()) {
            System.out.println("\n=== Criar Conta ===");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("CPF (somente números): ");
            String cpf = scanner.nextLine();

            System.out.print("Data de nascimento (AAAA-MM-DD): ");
            String dataNascimento = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Senha (somente números): ");
            int senha = scanner.nextInt();

            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id_agencia, nome, cidade FROM Agencia");
            System.out.println("\nAgências disponíveis:");
            while (rs.next()) {
                System.out.printf("%d - %s (%s)%n", rs.getInt("id_agencia"), rs.getString("nome"), rs.getString("cidade"));
            }
            System.out.print("Escolha o ID da agência: ");
            int idAgencia = scanner.nextInt();
            scanner.nextLine();

            PreparedStatement checkStmt = conn.prepareStatement("SELECT 1 FROM Cliente WHERE cpf = ? OR email = ?");
            checkStmt.setString(1, cpf);
            checkStmt.setString(2, email);
            ResultSet checkRs = checkStmt.executeQuery();
            if (checkRs.next()) {
                System.out.println("CPF ou email já cadastrados.");
                return;
            }
 
            String sqlCliente = "INSERT INTO Cliente (nome, cpf, data_nascimento, email, senha, id_agencia) VALUES (?, ?, ?, ?, ?, ?) RETURNING id_cliente";
            PreparedStatement psCliente = conn.prepareStatement(sqlCliente);
            psCliente.setString(1, nome);
            psCliente.setString(2, cpf);
            psCliente.setDate(3, Date.valueOf(dataNascimento));
            psCliente.setString(4, email);
            psCliente.setInt(5, senha);
            psCliente.setInt(6, idAgencia);

            ResultSet clienteResult = psCliente.executeQuery();
            if (clienteResult.next()) {
                int idCliente = clienteResult.getInt("id_cliente");

                System.out.print("Tipo de conta (corrente/poupança): ");
                String tipo = scanner.nextLine().toLowerCase();

                String sqlConta = "INSERT INTO Conta (tipo, data_abertura, id_cliente) VALUES (?, CURRENT_DATE, ?)";
                PreparedStatement psConta = conn.prepareStatement(sqlConta);
                psConta.setString(1, tipo);
                psConta.setInt(2, idCliente);
                psConta.executeUpdate();

                System.out.println("Conta criada com sucesso!");
            }
        } catch (Exception e) {
            System.out.println("Erro ao criar conta: " + e.getMessage());
        }
    }
}

