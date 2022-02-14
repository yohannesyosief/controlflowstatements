package Constructor;

public class Student6Copying {
	int id;
	String name;
	//Constructor to initialize integer and string
	Student6Copying(int i,String n)
	{
		id=i;
		name=n;
	}
	//Constructor to initialize another object
	Student6Copying(Student6Copying s){
		id=s.id;
		name=s.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}


public static void main(String[]args)
{
	Student6Copying s1=new Student6Copying(111,"Akrem");
	Student6Copying s2=new Student6Copying(s1);
	s1.display();
	s2.display();
}
}
