package OopsPart1ClassesObjectsConstructors;

public class BankAccount {

	private int accountNumber;
	private int balance;
	private String name;
	private String email;
	private int phoneNumber;
	int deposit;
	int withdrawal;
	//to Genetate setters and getters go to,source --generate getters and setters
	
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public int getAccountNumber() {
		return this.accountNumber;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return this.balance;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	
	public void deposit() {
		balance+=deposit;
		System.out.println("The balance after new deposit is "+balance);
	}
	
	public void withdrawal() {
		balance-=withdrawal;
		System.out.println("The balance after the withdrawal is  "+balance);
	}


}
