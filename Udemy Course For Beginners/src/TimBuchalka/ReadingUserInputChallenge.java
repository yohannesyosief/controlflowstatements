package TimBuchalka;

import java.util.Scanner;

public class ReadingUserInputChallenge {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int counter =1;
		int sum=0;
		
		//while(true)
		while(counter<=10) 
		{
		//	int order=counter+1;
		System.out.println("enter number #"+counter);
		//System.out.println("enter number #"+order);
		
		
		boolean hasNextInt=scan.hasNextInt();
		//boolean isAnInt=scan.hasNextInt();
		
		if(hasNextInt) {
			int number=scan.nextInt();
			counter++;
			sum+=number;
//		//if(counter==10)
//		{
//			break;
//			}
		}
		else {
			System.out.println("Invalid number");
			//break;}
			
		}
		System.out.println("The sum is ="+sum);
		scan.close();

			
	}}}

