package ExceptionHandling;
//The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that normal flow of the
//application can be maintained

//in this page,we will learn about Java exceptions,its type and the difference between checked and unchecked exceptions

//What is Exception in java
//Dictionary meaning:Exception is an abnormal condition

//in Java,an exception is an event that disrupts the normal flow of the program.It is an object which is thrown at runtime.

//What is Exception Handling
//Exception handling is a mechanism to handle runtime errors such as ClassNotFoundException,etc.

//Advantage of Exception Handling
//The core advantage of exception handling is to maintain the normal flow of the application.An exception normally disrupts the normal 
//flow of the application that is why we use exception handling .let's take a scenario:
//Statement 1;
//Statement 2;
//Statement 3;
//Statement 4;
//Statement 5;//exception occurs
//Statement 6;
//Statement 7;
//Statement 8;
//Statement 9;
//Statement 10;

//Suppose there are 10 statements in your program and there occurs an exception at statement 5,the rest of the code will 
//not be executed i.e statement 6 to 10 will not be executed.If we perform exception handling,the rest of the  will be executed.
//That is why we use exception handling in Java

//Do You Know?
//What is the difference between checked and unchecked exception?
//What happens behind the code int data=50/0;
//Why use multiple catch block?
//is there any possibility when finally block is not executed?
//What is exception propagation?
//What is the difference between throw and throws key word?
//What are the 4 rules for using exception handling with method overriding?

//Hierarchy of java Exception classes
//The java.lang.Throwable class is the root class of java Exception hierarchy which is inherited by two subclasses:Exception and Error.
//A hierarchy of Java Exception classes are given below.
//Throwable --1.Exception   2.Error
//Exception--1.IoException,2.SQLException,3.ClassNotFoundException ,4.RuntimeException
//RuntimeException--1.ArithmeticException,2.NullPointerException,3.NumberFormatException,4.IndexOutOfBoundsException
//IndexOutOfBounderException--1.ArrayIndexOutOfboundsException,2.StringIndexOutOfBoundException

//Error--1.StackOverflowError,2.VirtualMachineError,3.OutOfMemoryError


//Types of Java Exceptions
//There are mainly two types of exceptions:checked and unlocked.Here,an error is considered as the unchecked exception.
//According to oracle,there are three types of exceptions:
//1.Checked Exception,2.Unchecked Exception 3,Error

//Difference between Checked and Unchecked Exceptions

//1)Checked Exception
//The classes which inherit Throwable class except RuntimeException and Error are known as checked  exceptions 
//e.g IOException,SQLExceptionetc. Checked exception are checked at compile time.

//2)unchecked Exception
//The classes which inherit RuntimeException are known as unchecked exceptions e.g.ArithmeticException,NullPointerException,
//ArrayIndexOutOfboundsException etc.Unchecked exception are not checked at compile-time,but they are checked at runtime.

//3)Error
//Error is irrecoverable e.g. OutOfMemoryError,VirtualmachineError,AssertionError etc.

//Java Exception Keywords
//There are 5 keywords which are used in handling exception in Java.


//Try:-The "try" keyword is used to specify a block where we should place exception code.The try block must be followed by either
//catch or finally.It means,we can't use try block alone.

//catch:- The "catch" block is used to handle the exception.It must be preceded by try block which means we can't use catch block alone
//It can be followed by finally block later


//finally:-The "finally" block is used to execute the important code of the program.It is executed whether an exception is handled or not

//throw:- The "throw" keyword is used to throw an exception

//throws:- The "throws" keyword is used to declare exception.it doesn't throw an exception.it doesn't throw an exception.It specifies that
//there may occur an exception in the method.It is always used with method signature

//Common Scenarios of Java Exceptions
//There are given some scenarios where unchecked exceptions may occur.they are as follows:

//1)If we divide any number by zero,there occurs an ArithmeticException
//int a=50/0;//ArithmeticException

//2)A scenario where NullPointerException occurs
//if we have null value in any variables,performing any operation on the variable throws a NullPointerException.

//String s=null;
//(s.length());//nullPointerException

//3)A scenario where numberFormatException occurs
//The wrong formatting of any value may occur numberFormatException.Suppose I have a string that has characters,converting this 
//variable into digit will occur NumberFormatException
//String s="abc";
//int i=Integer.parseint(s);//NumberFormatException

//4) A scenario where arrayindexoutOfBoundsException occurs
//if you are inserting any value in the wrong index,it would result in ArrayindexoutOfboundsException as shown below:
//int a[]=new int[5];
//a[10]=50; //arrayIndexOutOfBoundsException

//Java Exception Index
//1.Java Try-Catch Block,2.Java Multiple-Catch Block,3.Java Nested Try,4.Java Finally Block,5.java Throw Keyword,6
//6.Java Exception Propagation,7.Java Throws keyword,8.Java Throws vs Throws ,9.Java Final vs Finally vs Finalize
//10,Java Exception Handling with Method overriding,11.Java Custom Exceptions


public class BasicConcepts {

}
