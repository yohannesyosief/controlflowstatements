package Polymorphism;
//We are going to go back to the car analogy.
//Created a base class called car.
//It should have a few fields that would be appropriate for a generic car class.
//engine ,cylinders,wheels,etc.
//Constructor should initialize cylinders(number of) and names,and set wheels to 4;
//and engine to true,Cylinders and names would be passed parameters.
//Create appropriate getters
//Create some methods like StarEngine,accelerate and brake
//show a message for each in the base class
//Now create 3 sub classes for your favorite vehicles.
//override the appropriate methods to demonstrate polymorphism in use.
//put all classes in the one java file(this one)


class Car{
	private String  name;
	private int numberOfCylinders;
	private int wheels;
	private boolean engine;
	public Car(String name, int numberOfCylinders) {
		super();
		this.name = name;
		this.numberOfCylinders = numberOfCylinders;
		this.wheels = 4;
		this.engine = true;
	}
	public String starEngine() {
		return"No engine";
	}
	
	public String accelerate() {
		
		return "Accelerate very fast";
		
	}
	
	public String brake() {
		return "Hav a good break";	
		
	}
	public String getName() {
		return name;
	}
	public int getNumberOfCylinders() {
		return numberOfCylinders;
	}
	
	//We need to create getters because we need to access them,but we can leave engine,because it true or obvious and number of wheels is four
	//so this two they are optional
	public int getWheels() {
		return wheels;
	}
	public boolean isEngine() {
		return engine;
	}
	}

class Bmw extends Car1{

	public Bmw() {
		super("BMW", 6);
			}

	@Override
	public String starEngine() {
		return "Good Engine";
		
				//super.starEngine();
	}

	@Override
	public String accelerate() {
		return "Good Accelartion";
		
		}

	@Override
	public String brake() {
		return "good brake";
			}
	}

class Opel extends Car1{

public Opel() {
		super("OPEL", 4);
		
	}


@Override
public String starEngine() {
	
	return "Smart Engine";
	}


@Override
public String accelerate() {
	return "Accelrate faster";
	
	
	}


@Override
public String brake() {
	return "Small isues";
	}

}


class Volkswagen extends Car1{

	public Volkswagen() {
		super("Volkswagen", 8);
			}

	@Override
	public String starEngine() {
		return "some how" ;
			}

	@Override
	public String accelerate() {
		return "Accelrate slowly";
			}

	@Override
	public String brake() {
		return "loose Break";
			}
	
	
	
}


public class MainChallenge {

	public static void main(String[] args) {
		
		Car1 car1=new Car1("Base Car",8);
		System.out.println(car1.getNumberOfCylinders()+" and name is "+car1.getName());
		System.out.println(car1.accelerate());
		System.out.println(car1.brake());
		System.out.println(car1.starEngine());

		}
	
	
	
//	public static Car randomCar() {
//		int number;
//		
		
		
		
		
	

}
