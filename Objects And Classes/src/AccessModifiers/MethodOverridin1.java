package AccessModifiers;//If we are overriding any method,overriden method(i.e declared in subclsses)
//must not be more restrictive
class A{
	protected void msg() {System.out.println("Hello java");}
}

public class MethodOverridin1 extends A{
	 void msg() {System.out.println("Hello java");}//C.T Error

	public static void main(String[] args) {
		MethodOverridin1 obj=new MethodOverridin1();
		obj.msg();
		
			}

}
