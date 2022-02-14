package Encapsulation;
//A java class which has only setter methods.

public class WriteOnly {
	//private data member
	private String college;
	//setter method for college
	public void setCollege(String college) {
		this.college=college;
	}}
//Now you can't get the value of the college,you can only change the value of college data member
//System.out.println(s.getCollege);}//Compile Time error,because there is no such methods
//System.out.println(s.college);//Compile Time Error,because the data member is private
//So,it can't be accessed from outside the class
