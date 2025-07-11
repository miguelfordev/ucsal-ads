package lista_arvore_classroom;

public class ArvBi<T> {

	private Node<T> rz;
	
	public void addR(T valor) {
		this.rz=new Node<>();
		this.rz.setValor(valor);
	}
	
	public Node<T> getRz(){
		return this.rz;
	}
	
	public void addEsq(Node<T> no, T valor) {
		if (no.getEsq() == null) {
			Node<T> aux = new Node<>();
			aux.setValor(valor);
            no.setEsq(aux);
        } else {
            addEsq(no.getEsq(), valor);
        }
	}
	
	public void addDir(Node<T> no, T valor) {
		if (no.getDir() == null) {
			Node<T> aux = new Node<>();
			aux.setValor(valor);
            no.setDir(aux);
        } else {
            addDir(no.getDir(), valor);
        }
	}
	
	public Node<T> bscNo(T valor) {
	    return bscNoRec(this.rz, valor);
	}
	
	public Node<T> bscNoE(Node<T> noInicial, T valor) {
	    return bscNoRec(noInicial, valor);
	}
	
	private Node<T> bscNoRec(Node<T> no, T valor) {
	    if (no == null) {
	        return null;
	    }

	    if (no.getValor().equals(valor)) {
	        return no;
	    }

	    Node<T> noencontrado = bscNoRec(no.getEsq(), valor);
	    if (noencontrado != null) {
	        return noencontrado;
	    }

	    return bscNoRec(no.getDir(), valor);
	}
	
	public void exibirOrdem(Node<T> no) {
        if (no != null) {
            exibirOrdem(no.getEsq());
            System.out.print(no.getValor() + " ");
            exibirOrdem(no.getDir());
        }
    }
	
	public void exibirPreOrdem(Node<T> no) {
        if (no != null) {
        	System.out.print(no.getValor() + " ");
            exibirOrdem(no.getEsq());
            exibirOrdem(no.getDir());
        }
    }
	
	public void exibirPosOrdem(Node<T> no) {
        if (no != null) {
            exibirOrdem(no.getEsq());
            exibirOrdem(no.getDir());
            System.out.print(no.getValor() + " ");
        }
    }
	
	public void exibirNoFolhas(Node<T> no) {
		if(no != null && no.getValor() != this.rz.getValor()) {
			System.out.print(no.getValor() + " ");
			if(no.getEsq() != null) {
				exibirNoFolhas(no.getEsq());
			}
			if(no.getDir() != null) {
				exibirNoFolhas(no.getDir());
			}
		} else {
			exibirNoFolhas(no.getEsq());
			exibirNoFolhas(no.getDir());
		}
	}

	public void exibirPaiFilho(Node<T> no) {
		if(no != null && no.getValor() == this.rz.getValor()) {
			System.out.print("Pai:");
			System.out.println(no.getValor() + " ");
			if(no.getEsq() != null) {
				System.out.print("Filho da esquerda: ");
				System.out.println(no.getEsq().getValor() + " ");
			}
			if(no.getDir() != null) {
				System.out.print("Filho da direita: ");
				System.out.println(no.getDir().getValor() + " ");
			}
		}
		
	}
	
}
