package quiz01;

import java.util.Scanner;

public class Quiz06 {

	public static void main(String[] args) {
		
		/*
		 * if구문 밖에 선언된 변수를 잘 활용합니다.
		 * 정수 3개를 입력 받습니다.
		 * 가장 큰값, 중간값, 작은값을 구분해서 출력. (조건 - 같은 수는 없다 라고 가정)
		 * 
		 * 입력
		 * 15, 30, 7 -> max:30, mid:15, min:7
		 * 1, 2, 3 -> max:3, mid:2, min:1
		 * 
		 */
		
		int max = 0;
		int mid = 0;
		int min = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(">");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		if (a > b && a > c) {
			if(b > c) {
				max = a; mid = b; min = c;
			} else { 
				max = a; mid = c; min = b;
			}	
		} else if(b > a && b > c) {
			if(a > c) {
				max = b; mid = a; min = c;
			} else { 
				max = b; mid = c; min = a;
			}	
		}else if(c > a && c > b) {
			if(a > b) {
				max = c; mid = a; min = b;
			} else { 
				max = c; mid = b; min = a;
			}	
		}
				
		System.out.println("max:" + max + "  mid:" + mid + "  min:" + min );
		
		scan.close();
	}
	
}
