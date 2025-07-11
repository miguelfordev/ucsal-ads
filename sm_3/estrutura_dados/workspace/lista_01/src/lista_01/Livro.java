package lista_01;

public class Livro implements ILivros{
	
	String titulo;
	String editora;
	String ano_publi;
	
	public Livro(String titulo, String editora, String ano_publi) {
		this.titulo = titulo;
		this.editora = editora;
		this.ano_publi = ano_publi;
	}

	@Override
	public String getTitulo() {
		// TODO Auto-generated method stub
		return this.titulo;
	}

	@Override
	public String getEditora() {
		// TODO Auto-generated method stub
		return this.editora;
	}

	@Override
	public String getDataPubli() {
		// TODO Auto-generated method stub
		return this.ano_publi;
	}
	
}
