package day07.override;

public class MainClass {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "홍길동";
		s.age = 20;
		s.studentId = "123123";
		System.out.println( s.info() ); //오버라이딩
		
		Teacher t = new Teacher();
		t.name = "이순신";
		t.age = 30;
		t.subject = "수학";
		System.out.println( t.info() ); //오버라이딩
		
		Employee e = new Employee();
		e.name = "장영길";
		e.age = 40;
		e.department = "영업";
		System.out.println( e.info() ); //오버라이딩
		
		
		
		
	}
}
