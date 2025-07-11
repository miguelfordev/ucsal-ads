package teste_java;

public class Aluno extends Pessoa implements Avaliavel {
    private double mediaFinal;

    public Aluno(String nome, String cpf, String matricula, double mediaFinal) {
        super(nome, cpf, matricula);
        this.mediaFinal = mediaFinal;
    }

    public double getMediaFinal() { return mediaFinal; }
    public void setMediaFinal(double mediaFinal) { this.mediaFinal = mediaFinal; }

    @Override
    public double avaliar() {
        return mediaFinal;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Aluno: %s | CPF: %s | Matrícula: %s | Média Final: %.2f\n", nome, getCpf(), matricula, mediaFinal);
    }
}