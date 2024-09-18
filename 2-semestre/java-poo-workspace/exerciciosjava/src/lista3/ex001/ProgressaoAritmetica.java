package lista3.ex001;

public class ProgressaoAritmetica {

	private int pt,r,ta;
	
	public ProgressaoAritmetica(int pt, int r) {
		this.pt = pt;
		this.r = r;
		this.ta = this.pt;
	}
	
	public int prxTermo() {
		int ta = this.ta;
		this.ta += this.r;
		return ta;
	}
	
	public void setPT(int pt) {
		this.pt = pt;
		this.ta = pt;
	}
	
	public void setR(int r) {
		this.r = r;
		this.ta = this.pt;
	}
	
	public String toString() {
		return this.pt+" - "+this.r;
	}
}
