package DataTypesInJava;

public class ForLoop {

	public static void main(String[] args) {
		int count=0;
		int sum=0;
		while(count<=6)
		{
			System.out.println("count is: "+count);
			sum+=count;
			count++;
		}
		System.out.println("Sum is: "+sum);
		System.out.println("Total numbers counted are: "+count);
		sum=0;
		count=0;
		for(int i=1;i<=1000;i++)
		{
			if((i%3==0)&&(i%5==0))
			{System.out.println("found number is: "+i);
			count++;
			sum+=i;
			}
			if(count==5) 
				break;
					}
		System.out.println("the sum of the numbers is "+sum);
		System.out.println("Total numbers counted are: "+count);

		
		
	}

}
