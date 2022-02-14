package Encapsulation;
//Encapsulation is the mechanism that allows you to restrict access to certain components,protect
//the members of a class from external access,we are stopping unauthorized access like classes or code out side of the 
//class we r working on,can be used to hide inner working of 
//lets create a class with out Encapsulation

public class Player {
	public String fullName;
	public int health;
	public String weapon;
	
	
	public void losehealth(int damage) {
		this.health=this.health-damage;
		if(this.health<=0) {
			System.out.println("player knokced out");
			//reduce number of lives remaining for the player
		}
	}
	public int healthRemaining() {
		return this.health;
	}
	

}
