package quiz01;

import java.util.Scanner;

public class Quiz14 {

	public static void main(String[] args) {
		
		/*
		 * 1. 가로, 세로 길이를 입력 받습니다.
		 * 2. 가로, 세로 길이만큼 사각형을 출력합니다.
		 * 3. 단, 윤곽만 나오면 됩니다.
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("가로>");
		int x = scan.nextInt();
		System.out.print("세로>");
		int y = scan.nextInt();
		
		for(int i = 1; i <= y; i++) {
			if(i == 1 || i == y) {
				for(int j = 1; j <= x; j++) {
					System.out.print("*");
				} 
			}else {
				for(int j = 1; j <= x; j++) {
					if(j == 1 || j == x) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
									
			}
			System.out.println();
				
			
		}
		scan.close();
		
	}
				
}

