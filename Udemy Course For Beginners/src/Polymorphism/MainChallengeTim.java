package Polymorphism;

class Car1{
	private boolean engine;
	private int cylinder;
	private String name;
	private int wheel;
	public Car1( int cylinder, String name) {
		
				this.cylinder = cylinder;
		this.name = name;
		this.engine = true;
         this.wheel = 4;
	}
	public boolean isEngine() {
		return engine;
	}
	public int getCylinder() {
		return cylinder;
	}
	public String getName() {
		return name;
	}
	public int getWheel() {
		return wheel;
	}
	
	
	public String startEngine(){
		//return "car->startEngine()";
		return getClass().getSimpleName()+"->startEngine()";
		}
	public String accelerate() {
		//return "Car->accelerate()";
		return getClass().getSimpleName()+"->accelerate()";

		}
	public String brake() {
		//return "Car->brake()";
		return getClass().getSimpleName()+"->brake()";

	}
	
}
class Mitsibushi extends Car1{

	public Mitsibushi(int cylinder, String name) {
		super(cylinder, name);
			}

	@Override
	public String startEngine() {
		return "Mitsubishi->startEngine()";
	}

	@Override
	public String accelerate() {
		return "Mitsubishi->accelerate()";
	}

	@Override
	public String brake() {
		
		return "Mitsubishi->brake()";
	}
	}

class Ford extends Car1{

	public Ford(int cylinder, String name) {
		super(cylinder, name);
			}

	@Override
	public String startEngine() {
		return "Ford->startEngine()";
		
		
	}

	@Override
	public String accelerate() {
		return "Ford->accelerate()";
	}

	@Override
	public String brake() {
		
		return "Ford->brake()";
	}
	}

class Holden extends Car1{

	public Holden(int cylinder, String name) {
		super(cylinder, name);
			}

	@Override
	public String startEngine() {
		return "Holden->startEngine()";
	}

	@Override
	public String accelerate() {
		return "Holden->accelerate()";
	}

	@Override
	public String brake() {
		
		return "Holden->brake()";
	}
	}




public class MainChallengeTim {

	public static void main(String[] args) {
		Car1 car=new Car1(8,"base car");
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		
		
		Mitsibushi mitsibushi=new Mitsibushi(6,"Outlander");
		System.out.println(mitsibushi.startEngine());
		System.out.println(mitsibushi.accelerate());
		System.out.println(mitsibushi.brake());
		
		
		Ford ford=new Ford(6,"Ford falcon");
		System.out.println(ford.startEngine());
		System.out.println(ford.accelerate());
		System.out.println(ford.brake());
		
		
		Holden holden=new Holden(6,"Holden Commodore");
		System.out.println(holden.startEngine());
		System.out.println(holden.accelerate());
		System.out.println(holden.brake());


	}

}
