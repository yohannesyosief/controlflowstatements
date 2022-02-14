package FinalKeyWord;
//is final method inherited
//yes,final method is inherited but you cannot override it,

class Honda2 {
	final void run() {System.out.println("running...");}

}
class  FinalInheritedBike extends Honda2{
	public static void main(String[]args) {
		FinalInheritedBike honda=new FinalInheritedBike ();
		honda.run();
	}
}
