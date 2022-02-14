package Composition2;

import Composition.Case2;
import Composition.Dimensions;
import Composition.Monitor;
import Composition.MotherBoard;
import Composition.Pc;
import Composition.Resolution;

public class Main2 {
	public static void main(String[] args) {
		Dimensions dimensions= new Dimensions(20,20,5);
		//Case theCase1=new Case("220B","Dell","240",new Dimensions(20,20,5));
		Case2 theCase1=new Case2("220B","Dell","240",dimensions);
		System.out.println(theCase1.getManufacturer()+  " "+theCase1.getPowerSupply()+" ");
		theCase1.pressPowerButton();
		
		Monitor theMonitor1=new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
		//we can create an instance of a class with out using a variable
		
		MotherBoard theMotherboard1 = new MotherBoard("BJ-200","Asus",4,6,"v2.44");
		
		//now we can create our pc
		Pc thePc=new Pc(theCase1,theMonitor1,theMotherboard1);
		thePc.getMonitor1().drawPixelAt(1500, 1200, "red");
		thePc.getMotherboard1().loadProgrma("Windows 1.0");
		thePc.getTheCase1().pressPowerButton();
		
	}
}
