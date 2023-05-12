package quiz06;

public class MainClass {
	public static void main(String[] args) {
		
		MyAccount acc = new MyAccount("123-456", "1234", 1000);
		
		acc.info();
		acc.deposit(1000);
		acc.withDraw(500);
		
		
		acc.info();
		//acc.withDraw(100000);
		
	}
}
