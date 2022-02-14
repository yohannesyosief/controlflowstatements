package FinalKeyWord;
//if you make any method as final,you cannot override it


class Honda {
	final void run() {System.out.println("running");}
}
	public class   FinalMethodBike extends Honda{
		void run() {System.out.println("running safely with 100kmph");}//cannot overide this final method from FinalMethodBike
		
	

	public static void main(String[] args) {
		FinalMethodBike  honda=new FinalMethodBike();
		honda.run();
			}

}
