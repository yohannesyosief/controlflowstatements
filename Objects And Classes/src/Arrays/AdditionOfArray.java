package Arrays;
//Java Program to demonstrate the addition of two matrices
public class AdditionOfArray {

	public static void main(String[] args) {
		//Creating two matrices
		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int b[][]= {{1,2,3},{4,5,6},{7,8,9}};
		
		int c[][]=new int[3][3];
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				c[i][j]=a[i][j]+b[i][j];
		System.out.println(c[i][j]+"");
			}
			System.out.println();//new line
		

}}}
