package DataTypesInJava;

public class DayasOfTheWeekChalenge {

	public static void main(String[] args) {
		
//		printDaysOfTheWeek(-1);
//		printDaysOfTheWeek(1);
//		printDaysOfTheWeek(2);
//		printDaysOfTheWeek(3);
//		printDaysOfTheWeek(4);
//		printDaysOfTheWeek(5);
//		printDaysOfTheWeek(6);
//		printDaysOfTheWeek(7);
		//Using return Statement
		for(int i=0;i<=7;i++)
		{
			System.out.println(printDaysOfTheWeek(i));
		}


		
			}
	public static String printDaysOfTheWeek(int day)
	{
		if(day==0)
		{
			//System.out.println("Sunday");
			return "Sunday";
			
		}
		else if(day==1)
		{
			//System.out.println("Monday");
			return "Monday";

		}
		else if(day==2)
		{
			//System.out.println("Tuesday");
			return "Tuesday";

		}
		else if(day==3)
		{
			//System.out.println("Wednsday");
			return "Wednsday";
		}
		else if(day==4)
		{
			//System.out.println("Thursday");
			return "Thursday";

		}
		else if(day==5)
		{
			//System.out.println("Friday");
			return "Friday";

		}
		else if(day==6)
		{
			//System.out.println("Saturday");
			return "Saturday";

		}
		else
		{
			//System.out.println("Invaid day");
			return "Invalid Day";

		}
//		switch(day)
//		{
//		case 0:
//			System.out.println("Sunday");
//			break;
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednsday");
//			break;
//		case 4:			System.out.println("Thursday");
//						break;
//		case 5:
//			System.out.println("Friday");
//			break;
//
//		case 6:
//			System.out.println("Saturday");
//			break;
//
//
//			default:
//				System.out.println("Invalid day");
				}
	}


