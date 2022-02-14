package InheritanceChallengeTimBuchalka;

//challenge
//Start with a base class of a vehicle,then create a Car class that inherits from this base class
//Finally,create another class, a specific type of car that inherits from the Car class
//You be able to hand steering	of,changing gears,and moving (speed in other words).
//You will want to decide where to put the appropriate state and behaviors(fields and methods).
//As mentioned above,changing gears,increasing/decreasing speed should be included.
//for you specific type of vehicle you will want to add something specific for that type of car


public class Vehicle2 {
	private String name;
	private String size;
	
	private int currentVelocity;
	private int currentDirection;
	public Vehicle2(String name, String size) {
		
		this.name = name;
		this.size = size;
		this.currentVelocity=0;
		this.currentDirection=0;
	}
	public void steer(int direction) {
		this.currentDirection+=direction;
		System.out.println("vehicle.steer(): Steering at "+currentDirection+" degrees.");
	}
	public void move(int velocity,int direction)
	{
		currentVelocity=velocity;
		currentDirection=direction;
		System.out.println("vehicle.move():Moving at "+currentVelocity+" in direction " +currentDirection);
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	public void stop() {
		this.currentVelocity=0; 
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public int getCurrentDirection()
	{
		return currentDirection;
	}

}
