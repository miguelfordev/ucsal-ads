package arvore_classroom;

public class ArvoreBinaria<T> {

	private No raiz;

    public void adicionarRaiz(int valor) {
        raiz = new No(valor);
    }

    public No getRaiz() {
        return raiz;
    }

    public void adicionarEsquerda(No no, int valor) {
        if (no.esquerda == null) {
            no.esquerda = new No(valor);
        } else {
            adicionarEsquerda(no.esquerda, valor);
        }
    }

    public void adicionarDireita(No no, int valor) {
        if (no.direita == null) {
            no.direita = new No(valor);
        } else {
            adicionarDireita(no.direita, valor);
        }
    }

    public void exibir(No no) {
        if (no != null) {
            exibir(no.esquerda);
            System.out.print(no.valor + " ");
            exibir(no.direita);
        }
    }
    
    public void exibirPre(No no) {
        if (no != null) {
            System.out.print(no.valor + " ");
            exibir(no.esquerda);
            exibir(no.direita);
        }
    }
    
    public void exibirPos(No no) {
        if (no != null) {
            exibir(no.esquerda);
            exibir(no.direita);
            System.out.print(no.valor + " ");
        }
    }
	
}
