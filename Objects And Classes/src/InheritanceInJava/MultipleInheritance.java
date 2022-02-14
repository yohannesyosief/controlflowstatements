package InheritanceInJava;
//To reduce the complexity and simplify the language,multiple inheritance is not supported in java
//compile time errors are better than runtime errors
class A{
	void msg() {System.out.println("Hello");}
}
class B{
	void msg() {System.out.println("Welcome");}
		
	}


 class MultipleInheritance extends A,B {  //suppose if it were
	 public static void main(String[]args)
	 {
		 MultipleInheritance obj=new MultipleInheritance();
		 obj.msg();//now which msg() method would be invoked?
		 
	 }

 }
 //output..compile time error
