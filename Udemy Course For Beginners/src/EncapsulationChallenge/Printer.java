package EncapsulationChallenge;

public class Printer {
private String tonerLevel;
private int numberOfPages=1;
private boolean isADuplex;
public Printer(String tonerLevel, int numberOfPages, boolean isADuplex) {
	super();
	this.tonerLevel = tonerLevel;
	this.numberOfPages = numberOfPages;
	this.isADuplex = isADuplex;
}

public void toner() {
	if(numberOfPages<=100) {
		System.out.println();
	}
	
}
public String getTonerLevel() {
	return tonerLevel;
}
public int getNumberOfPages() {
	return numberOfPages;
}
public boolean isADuplex() {
	return isADuplex;
}



}
