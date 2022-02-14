package Inheritance;

public class Main {

	public static void main(String[] args) {
		Animal animal=new Animal("Animal",1,1,5,1);
		
		Dog dog= new Dog("Rocky",8,20,2,4,1,20,"Long Silky");
		
		Fish salmon=new Fish("Salmon", 2, 100, 2, 2, 2);
		//dog.eat();
		//dog.walk();
		//dog.run();
		salmon.swim(5); 
			}

}
