package JavaNamingConventions;
//Java naming convention is a rule to follow as you decide what to name your identifiers such as class,package,variable,constan,method,etc.
//but it's not forced to fo;;ow.So,it's known as convention not rule.these conventions are suggested by several 
//Java communities such as Sun Microsystems and Netscape.

//All the classes,interfaces,packages,methods and fields language are given according to the Java namimg convention.It may generate
//confussion or erronous code.

//Advantages of naming conventions injava
//by using standard java naming conventions,you make your code easier to read for yourself and other programmers.
//Readibility of java program is very important.It indicates that less time is spent to figure out what the code does.


//The following are the key rules that must be followed by every identifier:
//..The name must not contain any white spaces.
//..The name should not start with special characters like &(ampersand),$(dollar),(underscore).

//let's see some other rues that should be followed by identifiers.

//Class
//..It should start  with uppercase letter.
//..it should be a noun such as Color,Button,System,Thread,etc.
//Use appropriate words,instead of acronyms.
//Example:-
//public class Employee
{
	//code snippet
}


//Interface
//1..It should start with the uppercase letter.
//2.. It should be an adjective such as Runnable,Remote,ActionListner.
//3..use appropriate words,instead of acrynoms
//Example:-
interface Printable{
	//code snippet
}


//Method
//1..it should start with lowercase letter
//2..It should be a verb such as main(),print(),println().
//3.. if the name contains multiple words,start it with a lwercase letter followed bu an uppercase letter such as actionPerformed().
//Example.

class Employee{
	//method
	void draw(){
		//code snippet
	}
}


//Variable
//1..It should start with a lowercase letter such as id,name.
//It should not start with special characters like&(amperssand).$(dollar),_(underscore).
//If the name contains multiple words,start it with the lowercase letter followed by an uppercase letter firstname,lastName.
//Avoid using one-character variables such as x,y,z.
//Example:-
class Employee1
{
	//variable
	int id;
	//code snippet


//Package
//1..It should be a lowercase letter such as java,lang
//2..if the name contains multiple words,it should be separated by dots(.) such as java.util,java.lang

//Example:-
//package com.javatpoint;//package
// class Employee
{
	//code snippet
}

//Constant 
//1..it should n]be in uppercase letters such as RED,YELLOW.
//2..If the name contains multiple words,it should be separated by an underscore(_) such as MAX_PRIORITY.
//3..	t may contain digits but not as the first letter.
//Example:-

class Employee2
{
	//constant
	static final int MIN_AGE=18;
			//code snippet
	
}
//CamelCase in java naming conventions
//Java follows camel-case syntax for naming the class,interface,method,and variable.

//If the name is combined with two words,the second word will start with uppercase letter always such as actionPerformed(),firstName,
//ActionListner,etc.
public class basicConcepts {

}}
