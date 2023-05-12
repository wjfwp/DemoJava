package day02;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
	
		for(int a = 1; a <= 10; a++) {
			sum += a;
		}
		
		System.out.println(sum);
		
		System.out.println("---------------------------------");
	
		for(int a = 10; a >= 1; a--) {
			System.out.println(a);
		}
	
	}
}
