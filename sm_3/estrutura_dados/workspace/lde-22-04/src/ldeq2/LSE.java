package ldeq2;

public class LSE<T> {
	
	private Celula<T> primeiro;
	private Celula<T> ultimo;
	private Celula<T> pA;
	private int c=0;
	
	public Celula<T> getpA(){
		return this.pA;
	}
	
	public void addLSE(T dado) {
		Celula<T> cel = new Celula<T>();
		cel.setDado(dado);
		if(this.c==0) {
			this.primeiro=cel;
			this.ultimo=cel;
		} else {
			this.ultimo.setProximo(cel);
			cel.setProximo(null);
			this.ultimo=cel;
		}
		this.c++;
	}
	
	public boolean tP() {
		if(this.c==0) {
			return false;
		} else if(this.pA==null) {
			this.pA=this.primeiro;
			return true;
		} else {
			boolean vP = this.pA.getProximo()!=null?true:false;
			this.pA = this.pA.getProximo();
			return vP;
		}
	}

}
