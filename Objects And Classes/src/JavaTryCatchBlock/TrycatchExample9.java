package JavaTryCatchBlock;
//Let's see an example to handle another unchecked exception.

public class TrycatchExample9 {

	public static void main(String[] args) {
		try {
		int arr[]= {1,3,5,7};
		System.out.println(arr[10]); //may throw exception
			}
		//handling exception
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("rest of code");
		}}
