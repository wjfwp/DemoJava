package quiz01;

import java.util.Scanner;

public class Quiz16 {

	public static void main(String[] args) {
		
		/*
		 * updown 게임
		 * 1~100까지 랜덤한 수를 1번 생성합니다.(반복문 밖에서)
		 * 
		 * 스캐너를 통해서 값을 입력받습니다.
		 * 랜덤 수가 입력받은 값보다 작으면 "더 작은수를 입력하세요"
		 * 랜덤 수가 입력받은 값보다 크면 "더 큰수를 입력하세요"
		 * 
		 * 정답을 맞추면 시도횟수: x회를 출력하고 종료
		 */
		
		Scanner scan = new Scanner(System.in);
		int r = (int)(Math.random()*101);
		//System.out.println(r);
		int count = 0;
		
		while(true) {
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
		}
		
		scan.close();
		
	}
}
