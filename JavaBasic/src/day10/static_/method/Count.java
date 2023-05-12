package day10.static_.method;

public class Count {

	public int a;
	public static int b;
	
	//일반메서드 - 일반멤버와, 정적멤버 모두 사용이 가능
	public int method01() {
		a = 10;
		b++;
		return b;
	}
	
	//정적 메서드 - 일반멤버를 사용할 수 없음, 정적멤버는 사용이 가능 
	//			 단, 객체생성을 통해서는 일반멤버 사용이 됩니다.
	public static int method02() {
		//a = 10; //사용이 안되는 이유 - static이 생성될 당시에 a변수는 없음
		Count c =new Count();
		c.a = 10;
		b++;
		return b;
	}
	
	
	
}
