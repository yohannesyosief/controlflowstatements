package JavaAbstraction;
abstract class Bank{
	abstract int getrateOfInterest();
}
class SBN extends Bank{
	int getRateOfInterest() {
		return 7;
	}
}
	class PNB extends Bank{
		int getRateOfInterest() {
			return 8;
		}
	}


public class TestBank {

	public static void main(String[] args) {
		Bank b;
		b=new SBN();
		System.out.println("Rate of interest: "+b.getrateOfInterest()+"%");
		
		b=new PNB();
		System.out.println("RAte of interest: "+b.getrateOfInterest()+"%");
		
		
			}

}
