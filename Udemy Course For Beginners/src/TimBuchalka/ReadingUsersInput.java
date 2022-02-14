package TimBuchalka;

import java.util.Scanner;

public class ReadingUsersInput {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter year of birth");
		boolean hasNextInt=scan.hasNextInt();//In order to make sure all input is Int not String or if user input characters
		if(hasNextInt) {
		
		int yearOfBirth=scan.nextInt();
		
		//to avoid skipping of next input
		scan.nextLine();//handle next line character(enter key)
		int age=2021-yearOfBirth;
		
		System.out.println("Enter name");
		String name=scan.nextLine();
		
		if(age>0 && age<100) {
		System.out.println(name+" was born in "+yearOfBirth+ " ,and he is " +age+" years old.");}
		else {
			System.out.println("Invalid age");
		}}
		else {
			System.out.println("Unable to purse year of birth");}
		scan.close();
		}
		
	}


