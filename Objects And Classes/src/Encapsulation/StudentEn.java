package Encapsulation;
//Let's see the simple example of encapsulation that has only one field with it's setter and getter methods
//A java class which is fully encapsulated class
//It has a private data members and getter and setter member
//Getters and setters are used to protect your data,particularly when creating classes.For each instance
//variable,a getter method returns its value...The getter method returns the value of the attribute.
//The setter method takes a parameter and assigns it to the attribute.

public class StudentEn {
	//Private data member
	private String name;
	//getter method for name
	public String getName() {
		return name;
	}
	//setter method for name
	public void setName(String name) {
		this.name=name;
	}
	

}
