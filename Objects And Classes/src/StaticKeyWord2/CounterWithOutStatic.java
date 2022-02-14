package StaticKeyWord2;

public class CounterWithOutStatic{

 
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



