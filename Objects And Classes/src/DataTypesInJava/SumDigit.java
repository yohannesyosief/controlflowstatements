package DataTypesInJava;

public class SumDigit {

	public static void main(String[] args) {
		
		//System.out.println(2%10);
		System.out.println("the sum of digits of 125 is : "  +sumDigits(125));
		System.out.println("the sum of digits of  -4 is :"+sumDigits(-4));
		System.out.println("the sum of digits of  1212 is :"+sumDigits(1212));
		System.out.println("the sum of digits of 12345 is :"+sumDigits(12345));

			}
	public static int sumDigits(int number) {
		if(number<10)
		{return -1;}
	
		
		int sum=0;
		while(number>0)
		{//extract the least significant number
			int digit=number%10;
			sum+=digit;
			//extracting the least significant number
			number/=10;
		}
		return sum;
		
	}

}
