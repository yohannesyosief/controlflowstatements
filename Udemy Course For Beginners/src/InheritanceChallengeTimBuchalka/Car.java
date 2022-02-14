package InheritanceChallengeTimBuchalka;

public class Car extends Vehicle2 {
	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	
	private int currentgear;

	public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
		super(name, size);
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentgear = 1;
	}
	public void changeGear(int currentGear) {
		this.currentgear=currentGear;
		System.out.println("Car.changeGear():Changed to "+this.currentgear+" gear");
		
	}
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVelocity():velocity " +speed+" direction"+direction);
		
		move(speed,direction);
		
		
	}
	
	

}
