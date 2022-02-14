package OopsPart1ClassesObjectsConstructors;

public class VipCustomer {
	private String name;
	private double creditLimit;
	private String emailAddress;
	
	public VipCustomer() {
		this("Default name",50000.0,"default emailAddress");}
	
	
public VipCustomer(int creditLimit,String emailAddress) {
		
		this("Default name",creditLimit,emailAddress);
		System.out.println("Constructor with default values");
	}


	public VipCustomer(String name, double creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
	}
	
	
	
	public String getName() {
		return name;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
	
	

}
