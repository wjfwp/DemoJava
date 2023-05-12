package quiz02;

public class AccountMain {

	public static void main(String[] args) {
		
		Account park = new Account("116-23","abc12", 10000);
		System.out.println( park.getBalance() );
		park.deposit(500);
		System.out.println( park.getBalance() );
		
		Account kim = new Account("450-13", "kk999", 5000000);
		kim.withDraw(120000);
		System.out.println(kim.getBalance());
		
		Account acc = new Account("123-45", "1234", 1000);
		acc.deposit(-5000);
		acc.withDraw(10000);
		
		int balance = acc.getBalance();
		System.out.println(balance);
		
	}
}
