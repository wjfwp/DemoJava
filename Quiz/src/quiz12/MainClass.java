package quiz12;

public class MainClass {
	
	public static void main(String[] args) {
		
//		Radio r = new Radio(); //300, sony
//		
//		r.setPrice(10000);
//		System.out.println(r.getName() );
//		System.out.println(r.getPrice() );
		
		
		Radio r = new Radio();
		Computer c = new Computer();
		Tv t = new Tv();
		
		MyCart cart = new MyCart(10000);
		cart.buy(t);
		cart.buy(c);
		cart.buy(r);
		
		
		
	}
	
	
	

}
