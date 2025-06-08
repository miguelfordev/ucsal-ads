package teste_java;

import java.util.ArrayList;

public class Turma {
    private String codigo;
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private Disciplina disciplina;

    public Turma(String codigo, Professor professor, Disciplina disciplina) {
        this.codigo = codigo;
        this.professor = professor;
        this.disciplina = disciplina;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void exibirDados() {
        System.out.println("Turma: " + codigo);
        disciplina.exibirDados();
        professor.exibirDados();
        System.out.println("Alunos:");
        for (Aluno a : alunos) {
            a.exibirDados();
        }
    }
}