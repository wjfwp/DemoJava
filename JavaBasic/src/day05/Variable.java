package day05;

public class Variable {

	int a = 1; //선언과 동시에 초기화는 가능함
	// int a; //선언과 초기화 따로 불가능
	// a = 1; 
	
	String b; // 멤버변수, 초기값이 없지만 사용가능
	
	void printNum(int d) {
		
		int c = 1; //지역변수
		
		System.out.println("멤버변수:" + a);
		System.out.println("멤버변수:" + b); 
		System.out.println("지역변수:" + c);
		System.out.println("지역변수(매개변수):" + d);
		
	}
	
	
	
	
	
	
	
}
