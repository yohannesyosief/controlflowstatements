package DoWhileLoop;

public class ContinueStatement {

	public static void main(String[] args) {
		int i=1;
		while(i<=10)
		{
			if(i==5) {
				i++;
			continue;
			}
			System.out.println(i);
			i++;

			
		}
			}
		
}

//5 in not printed,because the loop is continued when it reaches to 5
