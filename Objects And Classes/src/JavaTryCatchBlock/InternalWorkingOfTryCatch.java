package JavaTryCatchBlock;
//Internal working of java try-catch block
//int data=10/0;--->an object of exception class is thrown--->exception object-->is handled-->yes-->rest of the code is executed
//no-->JVM-->1) prints out exception description,2)prints the stack trace,3)terminate the program
//The JVM first checks whether the exception is handled or not.If exception is not handled,JVM provides a default exception handler
//that performs the following tasks:

// ..Prints out exception description.
//..prints the stack trace(Hierarchy of methods where the exception occured)
//..causes the program to terminate

//But if exception is handled by the application programmer,normal flow of the application is maintained 
//i.e rest of the code is executed

public class InternalWorkingOfTryCatch {

}
