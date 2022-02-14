package Composition;

public class Main {

	public static void main(String[] args) {
		Dimensions dimensions= new Dimensions(20,20,5);
		
		Case2 theCase=new Case2("220B","Dell","240",dimensions);
		
		Monitor theMonitor=new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
		//we can create an instance of a class with out using a variable
		
		MotherBoard theMotherboard = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
		
		//now we can create our pc
		Pc thePc=new Pc(theCase,theMonitor,theMotherboard);
		thePc.powerUp();
	}

}
