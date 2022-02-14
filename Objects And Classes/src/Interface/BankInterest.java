package Interface;
interface Bank{
	float rateOfInterest();
}
class SBI implements Bank{

	public float rateOfInterest() {return 9.15f;}
	}
class PNB implements Bank{

	
	public float rateOfInterest() {
		
		return 9.7f;
	}
	
}

public class BankInterest {

	public static void main(String[] args) {
		//Bank b=new SBI();
		SBI b=new SBI();
		System.out.println("Rate of interest: "+b.rateOfInterest());		
			}

}
