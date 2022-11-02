package studio7;

public class Die {
	
	private int n;

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public Die (int n) {
		this.n = n;
	}
	
	public int randNum () {
		int randNum = (int)(Math.random()*this.n) + 1;
		return randNum;
	}
	
	public String toString() {
		return "Number of Sides on Die: " + this.n;
	}
}
