package DataTypesInJava;

public class WhileLoop2 {
	
	public static void main(String[] args) {
		int number=0;
		while(number<=15)
		{
			number++;
			//if(number>=5)
			if(number<=5)

			{System.out.println("Skipping Number "+number);
			continue;
			//break;
			}
			System.out.println("number "+number);
			if(number>=10)
			{
				System.out.println("Breaking number "+number);
				break;
			}
			}

}}
