package OopsPart1ClassesObjectsConstructors;

public class MainCOnstructor {

	public static void main(String[] args) {
		AccountConstructor bobsAccount=new AccountConstructor();
		
		//AccountConstructor bobsAccount=new AccountConstructor( "12345", 0.00, "Bob Brown", "yt_john@yahoo.com","00708767831");
		System.out.println(bobsAccount.getNumber());
		System.out.println(bobsAccount.getBalance());
		bobsAccount.withdrawal(100);
		
		bobsAccount.deposit(50);
		
		bobsAccount.withdrawal(100);
		
		bobsAccount.deposit(51.0);
		bobsAccount.withdrawal(100);
		
		AccountConstructor timsAccount=new AccountConstructor("Tim","tim@yahoo.com","0987654");
		System.out.println(timsAccount.getNumber()+" name "+timsAccount.getCustomerName());
		
		
			}

}
