package teste_java;

public class Disciplina {
    private String nome;
    private String codigo;

    public Disciplina(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() { return nome; }
    public String getCodigo() { return codigo; }

    public void exibirDados() {
        System.out.printf("Disciplina: %s | Código: %s\n", nome, codigo);
    }
}
