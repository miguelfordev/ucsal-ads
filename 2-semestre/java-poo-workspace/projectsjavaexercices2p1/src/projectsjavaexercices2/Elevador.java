package projectsjavaexercices2;

public class Elevador {
		
	private int andarAtual;
	private int totalDeAndares;
	private int capacidadeElevador;
	private int quantidadePessoas;
	
	/**
	 * Construtor. Precisa receber o total de andares e a capacidade do elevador.
	 * Vai instanciar o elevador no térreo e vazio.
	 * @param capacidadeElevador
	 * @param totalDeAndares
	 */
	
	public Elevador(int capacidadeElevador, int totalDeAndares) {
		this.totalDeAndares=totalDeAndares;
		this.capacidadeElevador=capacidadeElevador;
	}
	
	/**
	 * Método para inserir uma pessoa no elevador. Retorna verdadeiro se a operação teve sucesso e falso caso contrário.
	 * @return
	 */
	
	public boolean entra() {
		if(this.quantidadePessoas>0) {
			this.quantidadePessoas++;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método para retirar uma pessoa no elevador. Retorna verdadeiro se a operação teve sucesso e falso caso contrário.
	 * @return
	 */
	
	public boolean sai() {
		if(this.quantidadePessoas>0) {
			this.quantidadePessoas--;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método para fazer o elevador subir um andar. Retorna verdadeiro se a operação teve sucesso e falso caso contrário.
	 * @return
	 */
	
	public boolean sobe() {
		if(this.andarAtual<this.totalDeAndares) {
			this.andarAtual++;
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Método para fazer o elevador descer um andar. Retorna verdadeiro se a operação teve sucesso e falso caso contrário.
	 * @return
	 */
	
	public boolean desce() {
		if(this.andarAtual>0) {
			this.andarAtual--;
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Método que devolve qual o andar em que o elevador se encontra.
	 * @return
	 */
	public int getAndarAtual() {
		return this.andarAtual;
	}
	
	/**
	 * Método que devolve a capacidade do elevador.
	 * @return
	 */
	public int getCapacidade() {
		return this.capacidadeElevador;
	}
	
	/**
	 * Método que devolve o total de andares do elevador.
	 * @return
	 */
	public int getTotalAndares() {
		return this.totalDeAndares;
	}
	
	
	/**
	 * Método que devolve a quantidade de pessoas dentro do elevador.
	 * @return
	 */
	public int getQuantidadePessoas() {
		return this.quantidadePessoas;
	}
	
	
	
	
	
}
