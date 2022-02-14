package DataTypesInJava;

public class Switch {

	public static void main(String[] args) {
		int switchValue=4;
				switch(switchValue)
		{
		case 1:
			System.out.println("the value was 1");
			break;
		case 2:
			System.out.println("the value was 2");
			break;
		case 3:case 4:case 5:
			System.out.println("the value was 3 or 4 or 5");
			System.out.println("Actually the value was "+switchValue);
			break;
			default:
				System.out.println("The value is not 1,2,3,4 or 5");
			
			
			}
		
			}

}
