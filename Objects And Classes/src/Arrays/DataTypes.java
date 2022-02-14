package Arrays;

public class DataTypes {
	public static void main(String[] args) {
		byte myNewByte=10;
		short myNewShort=20;
		int myNewInt=50;
		//int myTotal=myNewByte+myNewShort+myNewInt;
		//long myNewLong=(long)(50000+10*(myTotal));
		long myNewLong=50000l+10l*(myNewByte+myNewShort+myNewInt);
		short myTotal=(short)(1000+10*(myNewByte+myNewShort+myNewInt));
		System.out.println(myNewLong);
		System.out.println(myTotal);
		

		
		
	}

}
