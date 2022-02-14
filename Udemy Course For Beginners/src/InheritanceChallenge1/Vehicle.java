package InheritanceChallenge1;

public class Vehicle {
	private int wheels;
	private String color;
	
	
	
	public Vehicle(int wheels, String color) {
		super();
		this.wheels = wheels;
		this.color = color;
	}
	public void speed(int speed) {
		System.out.println("Vehicle.spedd() is called"+speed+"km/hr");
	}
	public void changeGear() {
		System.out.println("Vehicle.changeGear() called");
	}
	public int getWheels() {
		return wheels;
	}
	public String getColor() {
		return color;
	}
	

}
