package AutoboxingAndunboxingJavaTpoiny;
//Let's see the program where boxing beats variable argument
public class AutoBoxingWidening3 {
	static void m(Integer i) {System.out.println("Integer");}
	static void m(Integer... i) {System.out.println("Integer...");}


	public static void main(String[] args) {
		int a=30;
		m(a);
		

	}

}
