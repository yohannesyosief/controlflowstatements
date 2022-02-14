package Encapsulation;
//AAccount class which is a fully encapsualted class
//It has private data memebr and getter and setter method

public class Account {
	//private data members
	private long acc_no;
	private String name,email;
	private float amount;
	//public getter and setter methods
	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no=acc_no;
	}
	public String getName() {
		return name;
		}
	void setName(String name) {
		this.name=name;
		}
	public String getEmail() {
		return email;
	}
	void setEmail(String email) {
		this.email=email;
	}
	public float getAmount() {
		return amount;
	}
void setAmount(float amount) {
	this.amount=amount;
}
}
