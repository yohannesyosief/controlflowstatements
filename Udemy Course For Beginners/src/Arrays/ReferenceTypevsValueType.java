package Arrays;
//int double,float are value types,because they hold a value but String and array are reference types

import java.util.Arrays;

public class ReferenceTypevsValueType {
	public static void main(String[]args) {
	int myIntValue=10;
	int anotherIntValue=myIntValue;
	System.out.println("myIntValue= "+myIntValue);
	System.out.println("anotherIntValue= "+anotherIntValue);
	
	
	anotherIntValue++;
	System.out.println("myIntValue= "+myIntValue);
	System.out.println("anotherIntValue= "+anotherIntValue);

	int[] myIntArray=new int[5];
	int[] anotherArray=myIntArray;
		//Refrences is an address for an object,;myIntArray is a reference,reference holds an address for an object 
	//but an object itself,so we cannot access directly;so myIntArray and anotherArray hold the same address
	 System.out.println("myIntArray= "+Arrays.toString(myIntArray));
	 System.out.println("myIntArray= "+Arrays.toString(anotherArray));
	 
	 
	 anotherArray[0]=1;
	 
	 System.out.println("after change myIntArray= "+Arrays.toString(myIntArray));
	 System.out.println("after change myIntArray= "+Arrays.toString(anotherArray));
	  //unlike the first one the array value of index one is changed in both arrays,because both hold the same address ,
	 //both variables are referencing the same array,reference types represent the address of the variable rather 
	 // than the data itself
	 
	 
	 anotherArray=new int[] {4,5,6,7,8};
	 modifyArray(myIntArray);   //dereference or re initialize the array
	 System.out.println("after change myIntArray= "+Arrays.toString(myIntArray));
	 System.out.println("after change myIntArray= "+Arrays.toString(anotherArray));

	 }
	
	private static void modifyArray(int[] array) {
		
		array[0]=2;
		array= new int[] {1,2,3,4,5};
	}
}