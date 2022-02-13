package SwitchStatement;

public class EnumInSwitch {
	//enum is a special "class" that represents a group of constants(unchangable variables ,like  final variables).
	//to enum class ,use enum keyword,and separate the constants with a comma
	

	public enum Day {Sun,Mon,Tue,Wed,Thu,Fri,Sat}
		 
		public static void main(String[]args) {
			Day[] DayNow =Day.values();
			for(Day Now:DayNow)
			{
				switch(Now)
				{
				case Sun:
					System.out.println("Sunday");
					break;
				case Mon:
					System.out.println("Monday");
					break;
				case Tue:
					System.out.println("Tuesday");
					break;
				case Wed:
					System.out.println("Wednsday");
					break;
				case Thu:
					System.out.println("Thursday");
					break;
				case Fri:
					System.out.println("Friday");
					break;
				case Sat:
					System.out.println("Saturday");
					break;	
				}
			}
		}
}
				
				
			
				
			
		
			


