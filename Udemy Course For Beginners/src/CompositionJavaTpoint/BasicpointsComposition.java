package CompositionJavaTpoint;
//The composition is a way to design or implement the "has-a" relationship.Composition and inheritance both are design techniques.
//The inheritance is used to implement the "is-a" relationship.The "has-a" relationship is used to ensure the code reusability 
//in our program.In Composition,we use an instance variable that refers to another object.
//The composition relationship of two objects is possible when one object is fully dependent on it.the contained object
//should not exist without the existence of the parent object.In a simple way,we  can say it is a technique through
//which we can describe the reference between two or more classes.And for that,we use the instance variable,
//which should be used before it is created.
//Car -->Has-A -->Engine,  car-->Is-A-Vehicle




//Key points
//The Composition represents a part-of relationship
//Both entities are related to each other in the Composition.
//The Composition between two entities is done when an object contains a composed object,and the composed object cannot exist 
//without another entity.For example,if a university HAS-A college-lists,then a college is a whole,and the college lists are
//parts of that university.
//favor Composition over inheritance.
//If a university is deleted,then all corresponding colleges for that university should be deleted.
//Let's take an example of a university and its colleges to understand the concept of Composition
//We create a class College that contains variables,i.e name and address.We also create a class University that has a reference to 
//refer to the list of colleges.So ,if a university is permanently closed,then all colleges within that particular university 
//will be closed because colleges cannot exist without a university.The relationship between the university and
//colleges is Composition.
//class College;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
class College{
	public String name;
	public String address;
	
public College(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
}
//University has more than one college.
class University{
	private final List<College> colleges ;
	University(List<College>colleges)
	{
		this.colleges=colleges;
	}
	//getting total number of colleges
	public List<College>getTotalCollegesInUniversity()
	{
	return colleges;
}}

public class BasicpointsComposition {
	public static void main(String []args) {
		//Creating the objects of College class
		College c1=new College("Addis Ababa Institute Of Technology","Amist Kilo");
		College c2=new College("Addis Ababa Bussines and Econimics College","Dibab");
		College c3=new College("Addis Ababa School Of Medicine","Tiqur Anbesa");
		//Creating list which contains the no. of colleges.
		List<College>college=new ArrayList<College>();
		college.add(c1);
		college.add(c2);
		college.add(c3);
		University university=new University(college);
		List<College>colleges=university.getTotalCollegesInUniversity();
		for(College cg:colleges) {
			System.out.println("Name of College: "+cg.name+" and "+"  the Address is a t: "+cg.address);
		}
		
	}
}


//Benefits of using Composition
//Composition allows us to reuse the code.
//In Java,we can use multiple Inheritance by using the composition concept.
//he Composition provides better test-ability of a class.
//Composition allows us to easily replace the composed class implementation wit a better and improved version
//Composition allows us to dynamically change our programs's behavior by changing the member objects at run time.

