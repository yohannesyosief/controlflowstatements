package InheritanceChallenge1;

public class Car extends Vehicle {
	private String model;
	
	public Car( String model) {
		super(4, "blue");
		this.model = model;
	}

	public void carSpeed(int speed) {
		System.out.println("The speed of the car is "+speed+"Km/hr");
		
	}

	@Override
	public void speed(int speed) {
		System.out.println("Car.speed() called");
		carSpeed(speed);
				super.speed(speed);
	}

	@Override
	public void changeGear() {
		System.out.println("Gear of car changed");
		super.changeGear();
	}

	public String getModel() {
		return model;
	}
	
	
	
	

}
