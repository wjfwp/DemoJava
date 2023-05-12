package quiz16;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		
		/*
		 * updown 게임
		 *
		 *
		 * 에러가 발생하면 시도횟수는 증가하고 다시 입력받을 수 있도록 코드를 변경
		 *
		 */
		
		Scanner scan = new Scanner(System.in);
		int r = (int)(Math.random()*101);
		//System.out.println(r);
		int count = 0;
		
		while(true) {
			
			try {
				System.out.print("정답입력>");
				int x = scan.nextInt();
				count++;
				if(r > x) {
					System.out.println("더 큰 수를 입력하세요");			
				} else if(r < x) {
					System.out.println("더 작은 수를 입력하세요");
				} else {
					System.out.println("정답입니다");
					System.out.println("시도횟수:" + count);
					break;
				}
				
			} catch (Exception e) {
				System.out.println("정수만 입력하세요");
				scan.nextLine();
				count++;
			}
			
		
		}
		
		scan.close();
		
	}
}
