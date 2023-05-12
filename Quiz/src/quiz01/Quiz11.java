package quiz01;

import java.util.Scanner;

public class Quiz11 {

	public static void main(String[] args) {
		
		/*
		 * 1. 정수를 입력받습니다.
		 * 2. 입력받은 수까지 약수의 합
		 * 
		 * 예시
		 * 입력수 10
		 * 약수의합 18
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();
		int i = 1;
		int sum = 0; //합계 누적
		
		while(i <= num) {
			if(num % i == 0) { //약수의 조건 (12 % 2 == 0)
				sum += i;  //i를 누적
			}
			i++;
		}
		
		System.out.println(sum);
		
		
		
		scan.close();
	}
}
