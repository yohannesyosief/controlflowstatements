package Encapsulation;

public class MainEncapsulation {

	public static void main(String[] args) {
		
		
		PlayerEncapsulation player=new PlayerEncapsulation("John",50,"Sword");
		PlayerEncapsulation player2=new PlayerEncapsulation("John",200,"Sword");
		
		System.out.println("Initial health is "+player.getHealth());
		System.out.println("Initial health is "+player2.getHealth());
		
		//we can change any names with out affecting our code//We are giving all the control to the PlayerEncapsulation

	}

}
