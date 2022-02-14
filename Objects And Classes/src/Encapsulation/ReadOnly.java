package Encapsulation;
//A java class which has only getter methods.


public class ReadOnly {
	//private data member
	private String college="AAIT";
	//getter method for college
	public String getCollege() {
		return college;
	}}
//Now ,you can't change the value of the college data members whic is "AAIT"
//s.setCollege("6 Kilo");//Will render compile time error
