package Constructor;
//java program to demonstrate the use of the parameterized constructor

public class Student4 {
	int  id;
	String name;
	//Creating a parameterized constructor
	Student4(int i,String n)
	{
		id=i;
		name=n;
	
	}
	//method to display the values
	void display() {
		System.out.println(id+""+name);
	}


public static void main(String[]args) {
	//creating objects and passing values
	Student4 s1=new Student4(111,"Abrham");
	Student4 s2=new Student4(122,"Natu");
	s1.display();
	s2.display();
}
}
