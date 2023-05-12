package quiz09;

public class MainClass {

	public static void main(String[] args) {
		
		SuperSonicAp ap = new SuperSonicAp("speed");
		
		ap.takeOff();
		ap.fly(); //override
		ap.flyMode = 1;
		ap.fly();
		ap.land();
		
		System.out.println( ap.info() );
	}
}
