package IfElseStatements;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		int year;
		Scanner input=new Scanner(System.in);
		System.out.println("Plz enter Year");
		year=input.nextInt();
	    input.close();
		if(((year%4==0)&&(year%100!=0))||(year%400==0))
				{
		System.out.println("Fortunately the given year is ,Leap year");
		}
	
		else
		{
			System.out.println("It's common year");
		

		}

		
	}

}
