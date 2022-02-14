package FinalKeyWord;
//if you make any class final you cannot extend it

class Honda1 {}
public  class  FinalClassBikes extends Honda1{
	 void run() {System.out.println("running safely with 100kmph");}
	 
	 public static void main(String[]args) {
		 FinalClassBikes  honda=new FinalClassBikes ();
		 honda.run();
	 }}
 
 


