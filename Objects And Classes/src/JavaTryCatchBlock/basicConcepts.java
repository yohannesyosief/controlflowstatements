package JavaTryCatchBlock;
//Java Try block is used to enclose the code that might throw an exception.It must be used within the method
//If an exception occurs at the particular statements of try block,the rest of the block code will of execute.
//So,it is recommended not to keeping the code in try block that will not throw an exception.

//java try block must be followed by either catch or finally block.

//Syntax of java try-catch

public class basicConcepts {
	try {
		//code that may throw an exception
	}finally {}

}

//Java Catch block
//Java catch block is used to handle the Exception by declaring the type of exception within the parameter.
//The declared exception must be the parent class exception(i.e Exception) or the generated exception type.However,
//the good approach is to declare the generated type of exception.

//The catch block must be used after the try block only.We can use multiple catch block with a single try block.
