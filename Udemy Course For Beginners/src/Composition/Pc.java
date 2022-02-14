package Composition;
//This composition,we have created a new class called Pc,it has a case a field called case,it has a monitor a field called motherboard,
//it has motherboard a field called motherboard
//If we had used the extend option we could have only extended from one class ,we could run to limitations,
//but the pc can process all  the three other classes,the case,the monitor,the motherboard,
//it going to have the objects we create based on this class,will have objects case,monitor,motherboard in each we create




//to hide the functionality  further and do not allow  the calling program to access directly

public class Pc {
	private Case2 theCase;
	private Monitor monitor;
	private MotherBoard motherBoard;
	
	
	public Pc(Case2 theCase, Monitor monitor, MotherBoard motherBoard) {
		super();
		this.theCase = theCase;
		this.monitor = monitor;
		this.motherBoard = motherBoard;
	}
	public void powerUp() {
		theCase.pressPowerButton();
		drawLogo();
	}
private void drawLogo() {
	//Fancy graphics
	monitor.drawPixelAt(1200,50,"yellow"); 
	
}
public Monitor getMonitor1() {
	// TODO Auto-generated method stub
	return null;
}

	

}
