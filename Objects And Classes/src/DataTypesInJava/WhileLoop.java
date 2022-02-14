package DataTypesInJava;

public class WhileLoop {

	public static void main(String[] args) {
		int number=4;
		int finishNumber=20;
		int sum=0;
		int evenNumbersFound=0;
		while(number<=finishNumber)
		{
			number++;
			//System.out.println(number+" is "+isEvenNumber(number));
			if(!isEvenNumber(number)) {
				
				//int sum2=0;
				//System.out.println(isEvenNumber(number));
				System.out.println(isEvenNumber(number)+" :"+number+ " is odd number: ");
				
				
				
			continue;}
//			int sum2=0;
//			sum2+=number;
//			System.out.println("The sum of odd numbers is:"+sum2);

			
			evenNumbersFound++;
			//System.out.println("Even number: "+number);
			System.out.println(isEvenNumber(number)+": "+number+" is Even number: ");

			
			//System.out.println(isEvenNumber(number));

			
			sum+=number;

			if(evenNumbersFound==5)
			{
				break;
			}
			//System.out.println(isEvenNumber(5));
						
		}
		System.out.println("The totla number of even numbers is: "+evenNumbersFound);
		System.out.println("the sum of the even numbers is: "+sum);
}
	

	
			
	public static boolean isEvenNumber(int num) {
		if(num%2==0) {
		return true;
	}
return false;
	}
}
