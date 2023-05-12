package quiz13;

public class MainClass {

	public static void main(String[] args) {
		
		Shape circle = new Circle("원", 5); 
		System.out.println( circle.getName() );
		System.out.println( circle.getArea());
		
		Rect rect = new Rect("사각", 8);
		System.out.println( rect.getName() );
		System.out.println( rect.getArea() );
		
				
	}
}
