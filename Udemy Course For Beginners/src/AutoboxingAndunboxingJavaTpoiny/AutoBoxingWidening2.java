package AutoboxingAndunboxingJavaTpoiny;
//If there is possibility of widening and varargs,widening beats var-args; 

public class AutoBoxingWidening2 {
	static void m(int i,int i2) {System.out.println("int int");}
	static void m(Integer... i) {System.out.println("Integer...");}


	public static void main(String[] args) {
		short s1=30,s2=40;
		m(s1,s2);
			}

}
