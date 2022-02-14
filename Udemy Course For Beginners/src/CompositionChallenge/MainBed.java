package CompositionChallenge;

public class MainBed {
	public static void main(String[]args) {
		
		Wall wall1=new Wall("East");
		Wall wall2=new Wall("West");
		Wall wall3=new Wall("South");
		Wall wall4=new Wall("North");
		System.out.println(wall1.getDirection());
		
		
		Ceiling ceiling=new Ceiling(12,55);
		
		Bed bed=new Bed("Modern",4,3,2,1);
		
		Lamp lamp=new Lamp("Classic",false,75);
		
		Bedroom bedroom=new Bedroom("Johns",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
		bedroom.makebed();
		bedroom.getlamp().turnon();
	System.out.println(bedroom.getWall1().getDirection());
	}

}
