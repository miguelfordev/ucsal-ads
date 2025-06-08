package teste_java;

public class Professor extends Pessoa implements Avaliavel{
    private String area;
    private double feedbackDeAluno;

    public Professor(String nome, String cpf, String matricula, String area) {
        super(nome, cpf, matricula);
        this.area = area;
    }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double avaliar(){
        return this.feedbackDeAluno;
    }

    @Override
    public void exibirDados() {
        System.out.printf("Professor: %s | CPF: %s | Matrícula: %s | Área: %s\n", nome, getCpf(), matricula, area);
    }
}
