package StaticKeyWord;



//Instance variables gets the memory at the time of object creation
//each object will have the copy of the instance variable,if it's incremented,it won't reflect other object
//so each object will have the value 1 in the count variable
//Java program to demonstrate the use of an instance variable
//which get memory each time when we created an object of the class



public class CounterWithOutStatic {
int	count=0;  //will get memory each time when the instance is created
public void Counter(){
	count++;
	System.out.println(count);
}

	public static void main(String[] args) {
		CounterWithOutStatic     c1=new CounterWithOutStatic(); 
		CounterWithOutStatic     c2=new CounterWithOutStatic();
		CounterWithOutStatic      c3=new CounterWithOutStatic();
		
c1.Counter();
c2.Counter();
c3.Counter();

	}
	

}
