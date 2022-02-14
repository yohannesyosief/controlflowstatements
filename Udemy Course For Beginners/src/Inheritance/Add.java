package Inheritance;

public class Add {
	//public static void Adding(int a,int b) 
	//public void Adding(int a,int b)
	private static int Adding(int a,int b){
		int c=a+b;
		//System.out.println("Vaue of c="+c);
		return c;
	}

	public static void main(String[] args) {
//		Add ad=new Add();
//		ad.Adding(2, 3);
		//Adding(2,3);
		int d=Adding(2,3);
		System.out.println("value of d="+d);
		
		

	}

}
