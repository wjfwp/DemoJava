package quiz04;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior war = new Warrior("전사");
		
		war.info();
		war.bash();
		
		System.out.println(war.mp);
	}
}
