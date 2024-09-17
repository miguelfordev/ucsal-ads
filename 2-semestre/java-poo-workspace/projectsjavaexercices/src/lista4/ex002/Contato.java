package lista4.ex002;
import java.lang.*;
public class Contato {

	private String nome;
	private int numero;
	private StringBuilder data;
	private String dia,mes,ano;
	private String email;
	
	public Contato(String nome, int numero, String dia, String mes, String ano, String email) {
		this.nome = nome;
		this.numero = numero;
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		StringBuilder sb = new StringBuilder();
		sb.append(dia+"/"+mes+"/"+ano);
		this.data = sb;
		this.email = email;
	}
	
	public String consultaMes() {
		return this.mes;
	}
	
	public String consultaNome() {
		return this.nome;
	}
	
	public String toString() {
		return "\nNome: "+this.nome+"\nTelefone: "+this.numero+"\nData de Nascimento: "+this.data+"\nEmail: "+this.email+"\n";
	}
}
