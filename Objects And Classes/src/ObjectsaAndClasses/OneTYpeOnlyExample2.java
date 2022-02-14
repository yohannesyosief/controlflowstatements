package ObjectsaAndClasses;

//We can create multiple objects by one type only as we do in case of primitive
class Rectangle2{
	int length;
	int width;
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea()
	{
		System.out.println(length*width);
	}
	
		
	
}

public class OneTYpeOnlyExample2 {

	public static void main(String[] args) {
		Rectangle2 r1=new Rectangle2(),r2=new Rectangle2();
		r1.insert(10, 6);
		r2.insert(5, 4);
		r1.calculateArea();
		r2.calculateArea();
		}

}
