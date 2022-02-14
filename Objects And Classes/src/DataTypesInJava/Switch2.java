package DataTypesInJava;

public class Switch2 {

	public static void main(String[] args) {
		char word='C';

		switch(word)
		{
		case 'A':
			System.out.println("The value is A");
			break;
		case 'B':
			System.out.println("The value is B");
			break;
		case 'C' :case'D':case'E':
			System.out.println("the value is C ,D or E");
			System.out.println("Actually it was "+word);
			break;
			default:
				System.out.println("No value");
				
			
			
			
		}
		String month="January";
		switch(month.toLowerCase())
		{
		case "january":
			System.out.println("Jan");
			break;
		case "february":
			System.out.println("Feb");
			break;
			default:
				System.out.println("Not sure");
				

			
		}
		
			}

}
