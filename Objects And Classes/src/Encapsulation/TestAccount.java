package Encapsulation;

public class TestAccount {

	public static void main(String[] args) {
		Account acc= new Account();
		acc.setAcc_no(1234567);
		acc.setName("Yohannes Yosief");
		acc.setEmail("yt_john@yahoo.com");
		acc.setAmount(500000);
		System.out.println(acc.getAcc_no()+
				" "+acc.getName()+"  "
				+acc.getEmail()+"  "
				+acc.getAmount());
		}

}
