package quiz01;

public class MethodQuiz01 {

	public static void main(String[] args) {
		
		method1();
		String r1 = method2("가");
		System.out.println(r1);
		
		double r2 = method3(1,9,4.6); 
		System.out.println(r2);
		
		String r3= method4(5);
		System.out.println(r3);
		
		method5("안녕", 3);
		
		int r4 = maxNum(50, 9);
		System.out.println(r4);
		
		int r5 = abs(-45);
		System.out.println(r5);
		
		//
		String result = java(5);
		System.out.println(result);
	}
	
	static void method1() {
		System.out.println("안녕");
	}
	
	static String method2(String a) {
		return a ;
	}
	
	static double method3(int a, int b, double c) {
		return a + b + c;
	}
	
	static String method4(int a) {
		/*
		String str = "";
		if(a % 2 == 0) {
			str +="짝수";			
		} else {
			str +="홀수";
		}
		return str;
		*/
		
		/*
		if(a % 2 ==0) {
			return "짝수";
		} else {
			return "홀수";
		}
		*/
		
		return a % 2 == 0? "짝수" : "홀수";
	}
	
	static void method5(String a, int b) {
		for(int i = 1; i <= b; i++ ) {
			System.out.print(a);
		}
		System.out.println();
	}
	
	static int maxNum(int a, int b) {
		if(a > b) {
			return a;
		} else {
			return b;
		}
	}
	
	static int abs(int a) {
		return a > 0 ? a : -a;
	}
	
	//
	static String java(int a) {
		String str = "";
		for(int i = 1; i <= a; i++) {
			if(i % 2 == 1) {
				str += "자";
			} else {
				str += "바";
			}
		}
		return str;
	}
	
	
	
	
}
