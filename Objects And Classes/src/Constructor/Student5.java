package Constructor;
//Constructor Overloading in java
//Constructor is like a method,but without return type
//it can also be overloaded
//Overloading is a technique of having more than one constructor
//with different parameter list

public class Student5 {
	int id;
	String name;
	int age;
	//Creating a two arg constructor
	Student5(int i,String n) 
	{
		id=i;
		name=n;
		
	}
		Student5(int i,String n,int a)
		{
			id=i;
			name=n;
			age=a;
		}
		void display()
		{
			System.out.println(id+" "+name+" "+age);
		}
		
	

public static void main(String[]args)
{
	Student5 s1=new Student5(754,"Yohannes");
	Student5 s2=new Student5(860,"Samsom",25);
	s1.display();
	s2.display();
}
	
}
