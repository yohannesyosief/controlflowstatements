package FinalKeyWord;
//The final keyword in java is used to restrict the user,it can be used in many context.
//final can be:
//1.variable,2.method,3.class
//a final variable that has no value ,it is blank final variable or uninitialized final variable
//it can be initialized in the constructor only,can also be static also which will be initialized in static block
//Java final Keyword is used
//1.Stop Value Change
//2.Stop Method Overriding
//3.Stop Inheritance
//If you make any variable as final,you cannot change the value of final variable(it will be constant)
class Bike9{
	final int speedlimit=900; //final variable
	void run() {
		speedlimit=400;//the final field Bike9.speedlimit cannot be assigned
	}
}

public class BasicConcepts {
	public static void main(String[]args) {
		Bike9 b=new Bike9();
		b.run();
	}}
//There is a final variable speedlimit,we are going to change the value of this variable,
//but it cannot be changed because final variable once assigned a value can never be changed
