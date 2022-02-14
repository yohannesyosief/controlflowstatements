package Encapsulation;

public class MainPalyer {
	public static void main(String[]args) {
		Player player=new Player();
		player.fullName="Tim";
		player.health=20;
		player.weapon="Sword";
		System.out.println("the player is "+player.fullName+" with Health capacity "+player.health);
		
		
		//So even though we are not in that class,we can access them directly,because the access modifier is public
		int damage=10;
		player.losehealth(damage);
		System.out.println("Remaining health= "+player.healthRemaining() );
		
		 damage=11;
		 player.health=200;//we r taking control out of player class
		player.losehealth(damage);
		System.out.println("Remaining health= "+player.healthRemaining() );
		

		
		
	}

}
