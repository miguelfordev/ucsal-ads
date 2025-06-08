package q04;

public class AB<T> {

	private No<T> r;
	
	public void addR(T v) {
		this.r=new No<>();
		this.r.setV(v);
	}
	
	public No<T> getR(){
		return this.r;
	}
	
	public void addE(No<T> no, T v) {
		if (no.getE() == null) {
			No<T> aux = new No<>();
			aux.setV(v);
            no.setE(aux);
        } else {
            addE(no.getE(), v);
        }
	}
	
	public void addD(No<T> no, T v) {
		if (no.getD() == null) {
			No<T> aux = new No<>();
			aux.setV(v);
            no.setD(aux);
        } else {
            addD(no.getD(), v);
        }
	}
	
	public No<T> bscNo(T v) {
	    return bscNoRec(this.r, v);
	}
	
	public No<T> bscNoE(No<T> noI, T v) {
	    return bscNoRec(noI, v);
	}
	
	private No<T> bscNoRec(No<T> no, T v) {
	    if (no == null) {
	        return null;
	    }

	    if (no.getV().equals(v)) {
	        return no;
	    }

	    No<T> noencontrado = bscNoRec(no.getE(), v);
	    if (noencontrado != null) {
	        return noencontrado;
	    }

	    return bscNoRec(no.getD(), v);
	}
	
	public void exibirOrdem(No<T> no) {
        if (no != null) {
            exibirOrdem(no.getE());
            System.out.print(no.getV() + " ");
            exibirOrdem(no.getD());
        }
    }
	
	public void exibirPreOrdem(No<T> no) {
        if (no != null) {
        	System.out.print(no.getV() + " ");
            exibirOrdem(no.getE());
            exibirOrdem(no.getD());
        }
    }
	
	public void exibirPosOrdem(No<T> no) {
        if (no != null) {
            exibirOrdem(no.getE());
            exibirOrdem(no.getD());
            System.out.print(no.getV() + " ");
        }
    }
	
}
