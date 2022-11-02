package studio7;

public class Fraction {
	
	private int numerator;
	private int denominator;
	public int getNumerator() {
		return numerator;
	}
	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}
	public int getDenominator() {
		return denominator;
	}
	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}
	
	public Fraction (int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public String addition(Fraction fractionTwo) {
		int numeratorTwo = (numerator * fractionTwo.getDenominator()) + (denominator * fractionTwo.getNumerator());
		int denominatorTwo = denominator * fractionTwo.getDenominator();
		return numeratorTwo + " / " + denominatorTwo;
	}

}
