package Arrays;
//Java supports the feature of an anonymous ,so you don't need to declare the array while passing
//an array to the method
public class AnonymousArrayInjava {
	//creating a method which reeives an array as a parameter
	static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);
			}

	public static void main(String[] args) {
		printArray(new int[] {10,22,44,66});//passing anonymous array to method
		}}
