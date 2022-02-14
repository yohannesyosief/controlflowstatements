package Arrays;
//java Program to illustrate how to declare,instantiate,initial
//and traverse the java array
public class Example1 {

	public static void main(String[] args) {
		int a[]=new int[5];  //declaration and instantiation
		a[0]=10; //initialization
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//traversing array 
		for(int i=0;i<a.length;i++) {
			
			System.out.println(a[i]);
		}}}
//Instantiation:The new keyword is a java operator that creates the object.
//The phrase"instantiating a class" means the same thing as "creating an object".When you create an object
//you are creating an "instance " of a class,therefore "instantiating" a class
//Initialization:The new operator is followed by a call to a constructor,which initalizes the new object
//Declaration..Associates with variable name with an object type.,this declaration also 
//reserves the proper amount of memeory for the variable,Simply declaring a reference 
//variable does not create an object.For creating an objet we nned to use to create an object
