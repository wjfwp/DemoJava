package quiz01;

import java.util.Scanner;

public class Quiz17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int count1 = 0;
		int count2 = 0;
		
		
		while(true) {
			
			int a = (int) (Math.random()*101);
			int b = (int) (Math.random()*101);
			int c = (int) (Math.random()*2);
			
			System.out.println("-----------------");	
			System.out.println(a + (c == 0? " + " : " - ") + b + " = ?");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요.]");
			System.out.print(">");
			int num = scan.nextInt();

			
			if(num == 0) {
				System.out.println("프로그램 정상종료");
				System.out.println("정답:" + count1);
				System.out.println("오답:" + count2);
				break;
			} else if(num == (a+b) || num == (a-b)) {
				System.out.println("정답입니다");
				count1++;
			} else {
				System.out.println("틀렸는데요?");
				count2++;
			}
			
		}
		
			
		scan.close();		
		
		
		
	}
}
