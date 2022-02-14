package Encapsulation;

public class PlayerEncapsulation {
	
	private String name;
	private int hitpoints=100;
	//private int health=100;

	private String weapon;
	
	public PlayerEncapsulation(String name, int health, String weapon) {
		super();
		this.name = name;
		
		if(health>0 && health<=100) {
		this.hitpoints = health;
		}
		
	this.weapon = weapon;
	}
	
	public void losehealth(int damage) {
		this.hitpoints=this.hitpoints-damage;
		if(this.hitpoints<=0) {
			System.out.println("player knokced out");
			//reduce number of lives remaining for the player
		}
	}

	public int getHealth() {
		return hitpoints;
	}

	

}
