package Aggregation;
//in this example,we have created the reference of Operation class in the circle class
class Operation{
	int square(int n) {
		return n*n;
	}
}
class Circle{
	Operation op;//aggregation
	double pi=3.14;
	
	double area(int radius) {
		op=new Operation();
		int rsquare=op.square(radius);//code reusability(i.e delegate the method call)
		return pi*rsquare;
	}
}

public class Example1 {
	public static void main(String[]args)
	{
		Circle c=new Circle();
		double result=c.area(5);
		System.out.println(result);}
}
//When do we use Aggregation
//..Code reuse is also best achieved by aggregation when there is no is-a relationship
//..Inheritance should be used only if the relationship is-a maintained the lifetime of the objects involved;
//otherwise aggregation is the best choice
