package JavaPackage;
//if you use package.* then all the classes and interfaces of this package will be accessible but not sub packages
//The important keyword is used to make the classes and interface of another packages accessible to
//the current package


public class B {
	public static void main(String[]args) {
		pack.A obj=new pack.A();//using fully qualified name
		obj.msg();
		
}}
//If you import a package,sub package will not be imported
//If you import a package ,all the classes and interface of that package will be imported excluding the 
//classes and interface of the subpackages.Hence,you need to import the sub package as weel
