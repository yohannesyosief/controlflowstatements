package OOPmasterChallenge;

public class MainHamburger {

	public static void main(String[] args) {
		
		Hamburger hamburger= new  Hamburger("basic","Sausage",3.56,"white");
		//System.out.println((hamburger.itemizedHamburger()));
		double price=hamburger.itemizedHamburger();
		
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		//price=hamburger.itemizedHamburger();
		System.out.println("total Burger price is "+hamburger.itemizedHamburger());
		
		HealthyBurger healthyBurger=new HealthyBurger("bacon",5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addhealthAddition1("Lentils", 3.41);
		//healthyBurger.itemizedHamburger();
		System.out.println("Total healthy Burger price is "+healthyBurger.itemizedHamburger());
		
		DeluxeBurger db=new DeluxeBurger();
		
		db.addHamburgerAddition3("should not do this", 50.53);
		db.itemizedHamburger();


		
	}

}
