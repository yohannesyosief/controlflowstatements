package IfElseStatements;

import java.util.Scanner;

public class NestedIfEx2 {

	public static void main(String[] args) {
		
       int age,weight;
       Scanner input=new Scanner(System.in);
       System.out.println("Please enter age");
       age=input.nextInt();
       System.out.println("please enter weight");
       weight=input.nextInt();
       if(age>18)
       {
    	   if(weight>50)
    	   {
    	   System.out.println("You can donate blood");
       }
    	   else {
    	   System.out.println("You are not eligible to donate blood");
    	   }
       }
    	   else
    	   {
    		   System.out.println("Age must be over 18");
    	   }
		
			}}


