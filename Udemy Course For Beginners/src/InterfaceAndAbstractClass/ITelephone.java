package InterfaceAndAbstractClass;

public interface ITelephone {
	//public or private are redundant to interface ,because we are going to implement the methods in other class
	void powerOn();
	void dial(int phoneNumber);
	void answer();
	boolean callPhone(int phoneNumber);
	boolean isRinging();

}
