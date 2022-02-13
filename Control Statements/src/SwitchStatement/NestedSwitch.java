package SwitchStatement;

public class NestedSwitch {

	public static void main(String[] args) {
		char branch='C';
		int collegeYear=4;
		
		
		switch(collegeYear)
		{
		case 1:
			System.out.println("English,Maths,Science");
			break;
		case 2:
			switch(branch)
			{
			case 'C':
			System.out.println("Operation System,Java,Data Structure");
			break;
			case 'M':
				System.out.println("Drawing,Manufacturing Machines");
				break;
			}
			break;
		case 3:
			switch(branch)
			{
			case 'C':
				System.out.println("Fundamentals of logic design,Microelectronics");
				break;
			case'E':
				System.out.println("Embedded System,Image Processing");
				break;
			case'M':
				System.out.println("Production Technology,Thermsl Engineering");
				break;
			}
			break;
		case 4:
			switch(branch)
			{
			case 'C':
				System.out.println("Data Comunication and Networks,MultiMedia");
				break;
			case 'E':
				System.out.println("Embedded System,Image Processing");
				break;
				case 'M':
					System.out.println("Productuon Technology.Thermal Engineering");
				break;
			}
			break;
		}
				
			}
		
	}



				
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
	


