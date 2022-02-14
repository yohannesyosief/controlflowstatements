package TimBuchalka;

import java.util.Scanner;

public class ReadingInputChallenge2 {
	Scanner scan= new Scanner(System.in);
	int counter =0;
	int sum= 0;
	
	while(true)
	
	{
		int order=counter+1;
		System.out.println("enter number #"+order+":");
	
	
		boolean isAnInt=scan.hasNextInt();
	
	if(isAnInt) {
		int number=scan.nextInt();
		counter++;
		sum+=number;
	if(counter==10)
	{
		break;
		}
	}
	else {
		System.out.println("Invalid number");
	}
	scan.nextLine(); 
	}
	System.out.println("The sum is ="+sum);
	scan.close();
}}
