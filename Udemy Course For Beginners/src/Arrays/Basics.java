package Arrays;

public class Basics {
	public static void main(String[]args) {
	
	int [] myIntArray=new int[20];  //{1,2,3,4,5,6,7,8,9,10}; 

//	int [] myIntArray=new int[10] ;
//	myIntArray[5]=50;
//	myIntArray[1]=476;
//	myIntArray[0]=45;
//	
	
	//double[] myDoubleArray=new double[10];
//	System.out.println(myIntArray[0]);
//	System.out.println(myIntArray[1]);
//
//	System.out.println(myIntArray[2]);
//	System.out.println(myIntArray[3]);
//	System.out.println(myIntArray[4]);
//	System.out.println(myIntArray[9]);
//	for(int i=0;i<10;i++)
	for(int i=0;i<myIntArray.length;i++){
		myIntArray[i]=i*10;
		//System.out.println("Element "+i+" value is "+myIntArray[i]);
	}
	
//for(int i=0;i<myIntArray.length;i++) {
//		System.out.println("Element "+i+" value is "+myIntArray[i]);}
	
printArray(myIntArray);
	}
	public static void printArray(int[] array) {
		for(int i=0;i<array.length;i++) {
			System.out.println("Element "+i+ " ,value is "+array[i]);
		}
	}
}
