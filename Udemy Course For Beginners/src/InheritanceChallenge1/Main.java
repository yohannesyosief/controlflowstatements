package InheritanceChallenge1;

public class Main {

	public static void main(String[] args) {
		Car bmw= new Car("2005");
		
		System.out.println("The color of the bmw is "+bmw.getColor()+" and has "+bmw.getWheels()+" wheels and the model is "+bmw.getModel()  );
		bmw.changeGear();
		bmw.speed(50);
		
	
	
	}

}
