package Inheritance;

public class Dog extends Animal {
	// But we can also add methods that are unique for a dog
	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;

	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog.chew() called");
	}

	// What super means is to call the constructor that's for the class we are
	// extending from

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
		// Super means call the super equivalent of the class
	}

	public void walk() {
		System.out.println("Dog.walk() called");
		//Super.move is optional,we can remove if we want
		super.move(5);

	}

	public void run() {
		System.out.println("Dog.run() called");
		move(10);
	}

	private void moveLegs(int speed) {
		System.out.println("dog.movelegs() called");
	}

	@Override
	public void move(int speed) {

		System.out.println("dog.move() called");
		moveLegs(speed);

		super.move(speed);
	}

}
