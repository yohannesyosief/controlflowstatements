package StaticKeyWord;
//Java Static keyword in java is used for memory management
//we can apply static keyword with variables,methods,blocks and nested classes
//The static keyword belongs to the class than an instance of the class
//The static can be;1,variable (also known as class variable)
//2.Method(also Known as a class method)
//3.Block
//4.Nested class
//If we declare any variable as static,it is known as static variable
//..The static variable can be used to refer to the common property of all objects(which is not unique for each object)
//For example company name of employees,college name of students,etc.
//..The static variable gets memory only once in the class area at the time of class loading
//Advantages :it makes your program memory efficient,it saves memory
class Student6{
	int rollno;  //instance variable
	String name;
	static String college="ITS"; //static keyword
	//constructor
	Student6(int r,String n){
		rollno=r;
		name=n;
	}
	void display()
	{
		System.out.println(rollno+" "+name+"   "+college);
	}
}
//Test class to show the values of object
public class BasicIdea {
	public static void main(String[]args)
	{
		Student6 s1=new Student6(754,"Osman");
		Student6 s2=new Student6(540,"Ali");
		s1.display();
		s2.display();
		
		
	}
	

}
