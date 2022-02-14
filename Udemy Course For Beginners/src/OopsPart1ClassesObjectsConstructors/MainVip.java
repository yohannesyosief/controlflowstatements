package OopsPart1ClassesObjectsConstructors;

public class MainVip {

	public static void main(String[] args) {
		VipCustomer samsom=new VipCustomer();
		System.out.println(samsom.getName()+" credit limit "+samsom.getCreditLimit());
		
		
		VipCustomer lingo=new VipCustomer(40000,"ling@yahoo.com");
		System.out.println(lingo.getName()+", credit limit "+lingo.getCreditLimit()+" emailAddress "+lingo.getEmailAddress());
		
		VipCustomer john=new VipCustomer("john",50,"yt_john@yahoo.com");
		System.out.println(john.getEmailAddress()+" name, "+john.getName()+" credit limit, "+john.getCreditLimit());
		
		
		
		
		
			}

}
