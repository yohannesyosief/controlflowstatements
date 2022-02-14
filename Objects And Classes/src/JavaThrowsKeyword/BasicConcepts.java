package JavaThrowsKeyword;
//The java throws keyword is used to declare an exception.it gives an information to the programmer that there may occur
//an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained

//Exception Handling is mainly used to handle the checked exceptions>if there occurs any unchecked exception such as
//NullPointerException,it is programmers fault  that he is not performing check up before code being used.

//Syntax of java throws

//return-type method-name() throws exception-class-name{
//   method code
//}

//Which exception should be declared

//Answer)checked exception only,because:
//.. unchecked Exception:under your control so correct your code.
//..error:beyond your control e.g you are unable to do anything if there occurs VirtualMachineError or StackOverflowError.

//Advantages of Java throws keyword
//Now Checked Exception can be propagated(forwarded in call stack)

//It provides information to the caller of the method about the exception


public class BasicConcepts {

}
