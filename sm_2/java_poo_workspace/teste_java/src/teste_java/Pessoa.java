package teste_java;

public abstract class Pessoa {
    protected String nome;
    private String cpf;
    protected String matricula;

    public Pessoa(String nome, String cpf, String matricula) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getMatricula() { return matricula; }

    public abstract void exibirDados();
}