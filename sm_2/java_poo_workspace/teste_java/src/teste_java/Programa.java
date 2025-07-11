package teste_java;

import java.util.*;

public class Programa {
    private static ArrayList<Aluno> alunos = new ArrayList<>();
    private static ArrayList<Professor> professores = new ArrayList<>();
    private static ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private static ArrayList<Turma> turmas = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);
    
    
    public static void main(String[] args) {
    	
    	
        criarDadosIniciais();

        int opcao;
        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Listar Alunos");
            System.out.println("2. Buscar Aluno por Matrícula");
            System.out.println("3. Ordenar Alunos por Nome");
            System.out.println("4. Ordenar Alunos por Média");
            System.out.println("5. Alterar Aluno");
            System.out.println("6. Remover Aluno");
            System.out.println("7. Listar Turmas");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1 -> alunos.forEach(Aluno::exibirDados);
                case 2 -> buscarAluno();
                case 3 -> {
                    alunos.sort(Comparator.comparing(Pessoa::getNome));
                    System.out.println("Ordenado por nome.");
                }
                case 4 -> {
                    alunos.sort(Comparator.comparingDouble(Aluno::getMediaFinal).reversed());
                    System.out.println("Ordenado por média final.");
                }
                case 5 -> alterarAluno();
                case 6 -> removerAluno();
                case 7 -> turmas.forEach(Turma::exibirDados);
            }
        } while (opcao != 0);

        sc.close();
    }

    private static void criarDadosIniciais() {
        for (int i = 1; i <= 7; i++) {
            alunos.add(new Aluno("Aluno" + i, "000.000.000-0" + i, "MAT00" + i, Math.random() * 10));
            professores.add(new Professor("Professor" + i, "111.111.111-0" + i, "PROF00" + i, "Área" + i));
            disciplinas.add(new Disciplina("Disciplina" + i, "DISC00" + i));
        }

        for (int i = 0; i < 7; i++) {
            Turma t = new Turma("TURMA00" + (i + 1), professores.get(i), disciplinas.get(i));
            t.adicionarAluno(alunos.get(i));
            turmas.add(t);
        }
    }

    private static void buscarAluno() {
        System.out.print("Matrícula do aluno: ");
        String mat = sc.nextLine();
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(mat)) {
                a.exibirDados();
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private static void alterarAluno() {
        System.out.print("Matrícula do aluno a alterar: ");
        String mat = sc.nextLine();
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(mat)) {
                System.out.print("Novo nome: ");
                a.nome = sc.nextLine();
                System.out.print("Novo CPF: ");
                a.setCpf(sc.nextLine());
                System.out.print("Nova média final: ");
                a.setMediaFinal(Double.parseDouble(sc.nextLine()));
                System.out.println("Aluno alterado.");
                return;
            }
        }
        System.out.println("Aluno não encontrado.");
    }

    private static void removerAluno() {
        System.out.print("Matrícula do aluno a remover: ");
        String mat = sc.nextLine();
        Aluno removido = null;
        for (Aluno a : alunos) {
            if (a.getMatricula().equals(mat)) {
                removido = a;
                break;
            }
        }
        if (removido != null) {
            alunos.remove(removido);
            System.out.println("Aluno removido.");
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}