package Composition;

public class Car {
	private int doors;
	private int engineCapacity;
	public Car(int doors, int engineCapacity) {
		super();
		this.doors = doors;
		this.engineCapacity = engineCapacity;
	};
	

}
//Now since the car is extending the vehicle,this means the car is " is a vehicle",so has an is a relationship,
//Let's see the scenario of a computer,a computer has ,a mother board,a case and a monitor,the motherboard ,
//case and monitor are not computer in the same sense a car is a vehicle, 
//but a computer has a motherboard, a computer has a case, a computer has a monitor so they have "Has a relationship"
