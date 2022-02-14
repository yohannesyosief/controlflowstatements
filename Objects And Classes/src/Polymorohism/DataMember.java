package Polymorohism;
//A method is overriden,not the data members,so runtime polymorphism can't be achieved by data members
//In the example given below,both the classes have a data member by the reference variable of parent class
//which refers to the subclass object.Since we are accessing the data member which is not overriden,
//hence it will access the data memberof the parent class always
class Bike5{
	int speedlimit=90;	
}
public class DataMember extends Bike5 {
	int speedlimit=150;	


	public static void main(String[] args) {
		Bike5 b=new DataMember();
		System.out.println(b.speedlimit);
	}
		

}
