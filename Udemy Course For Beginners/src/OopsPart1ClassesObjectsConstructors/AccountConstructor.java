package OopsPart1ClassesObjectsConstructors;

public class AccountConstructor {

		private String number;
		private double balance;
		private String customerName;
		private String customerEmailAddress;
		private String customerPhoneNumber;
		
		
		public AccountConstructor() {
			//Constructor can be overloaded,or we can a constructor
			this("5674",2.50,"Default name","Default Address","default phoneNumber");
			System.out.println("Empty constructor called");
		}
		
		public AccountConstructor(String number,double balance,String customerName,String customerEmailAddress,
				String customerPhoneNumber	) {
			System.out.println("Constructor with parameter called");
			this.number = number;
			this.balance = balance;
			this.customerName = customerName;
			this.customerEmailAddress = customerEmailAddress;
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
			
		
		public AccountConstructor(String customerName, String customerEmailAddress, String customerPhoneNumber) {
			this("99999",50,customerName,customerEmailAddress,customerPhoneNumber);
			
		}

		public void deposit(double depositAmount)
		{
			this.balance+=depositAmount;
			System.out.println("deposit of "+depositAmount+" made a balnce of "+this.balance);
		}
		 
		public void withdrawal(double withdrawalAmount)
		{
		if(this.balance-withdrawalAmount<0)
		{
			System.out.println("only "+this.balance+"available,withdrawal not processed");}
		else {
			this.balance-=withdrawalAmount;
			System.out.println("withdrawal of "+withdrawalAmount+" processed.Remaining balance="+this.balance);
		}
		}

		public String getNumber() {
			return number;
		}

		public void setNumber(String number) {
			this.number = number;
		}

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmailAddress() {
			return customerEmailAddress;
		}

		public void setCustomerEmailAddress(String customerEmailAddress) {
			this.customerEmailAddress = customerEmailAddress;
		}

		public String getCustomerPhoneNumber() {
			return customerPhoneNumber;
		}

		public void setCustomerPhoneNumber(String customerPhoneNumber) {
			this.customerPhoneNumber = customerPhoneNumber;
		}
		
		
	}
