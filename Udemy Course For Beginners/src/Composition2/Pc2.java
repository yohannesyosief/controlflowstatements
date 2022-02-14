package Composition2;

public class Pc2 {

	private Case2 theCase1;
	private Monitor2 monitor1;
	private Motherboard2 motherboard1;
	
	
	public Pc2(Case2 theCase1, Monitor2 monitor1, Motherboard2 motherboard1) {
		
		this.theCase1 = theCase1;
		this.monitor1 = monitor1;
		this.motherboard1 = motherboard1;
	}
	

	public Case2 getTheCase1() {
		return theCase1;
	}


	public Monitor2 getMonitor1() {
		return monitor1;
	}


	public Motherboard2 getMotherboard1() {
		return motherboard1;
	}
	
}
