package Method;

public class Student {
	private int roll;
	private String name;
	public int getRoll()    //accessor method
	{
		return roll;
	}
	public void setRoll(int roll)  //mutator mehtod
	{
		this.roll=roll;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void display() {
		System.out.println("Roll no.:"+roll);
		System.out.println("Student name:"+name);
	}
	public static void main(String[]args)
	{
		Student s=new Student();
		s.roll=20;
		s.name="Samsom";
		s.display();
	}

}
