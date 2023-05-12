package quiz01;

import java.util.Scanner;

public class Quiz15 {

	public static void main(String[] args) {
		
		/*
		 * 1.입력받은 수까지의 소수들의 합
		 * 입력 7
		 * -> 바깥 반복문은 7까지 회전
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수입력>");
		int num = scan.nextInt();
		int count = 0; //약수의 개수를 셀 변수
		int sum = 0;//소수의 합 누적 변수
		
		for(int i = 1; i <= num; i++) {
			
			count = 0;

			for(int j = 1; j <= i; j++) {
				//각각의 i값이 소수인지를 판별해서 소수라면, sum에 누적하는 코드
				//적절한 시점 초기화...
				
				if(i % j == 0) {
					count++;
				}
			}
			
			if(count == 2) {//소수를 sum에 누적
				sum += i; //i는 소수				
			}
			
		}
		
		System.out.println(sum);
		scan.close();
	}
}
