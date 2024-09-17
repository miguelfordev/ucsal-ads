package lista2.ex001;

public class ProgressaoAritmetica {

	int primeiroTermo=2;
	int razao=3;
	int termoAtual=this.primeiroTermo;
	
	public int proximoTermo() {
		int atual=this.termoAtual;
		this.termoAtual+=this.razao;
		return atual;
	}
		/*1) Implemente uma classe chamada ProgressaoAritmetica que possui três atributos 
(primeiroTermo, razao, termoAtual) e um método chamado proximoTermo que 
devolve o termo atual para quem chamou e calcula o próximo termo atualizando o 
termoAtual. Em seguida crie uma aplicação que instancie um objeto da classe 
implementada, e mostre na tela os n primeiros termos da progressão, sendo n 
definido pelo usuário

Resposta Professora: 

int primeiroTermo=2;
	int razao=3;
	int termoAtual=this.primeiroTermo;
	
	public int proximoTermo() {
		int atual=this.termoAtual;
		this.termoAtual+=this.razao;
		return atual;
	}
*/

}
