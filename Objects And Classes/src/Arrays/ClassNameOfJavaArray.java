package Arrays;
//In java ,an array is an object.For array object,a proxy class is created whose name can be obtained 
//by getClass().getName() method on the object

public class ClassNameOfJavaArray {
	//Java Program to get the class name of array in java

	public static void main(String[] args) {
		//declaration and initialization of array
		int arr[]= {4,4,5};
		//getting the class name of java array
		Class c=arr.getClass();
		String name=c.getName();
		//printing the class name of java array
		System.out.println(name);
	}}
