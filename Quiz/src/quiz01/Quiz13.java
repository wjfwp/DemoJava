package quiz01;

import java.util.Scanner;

public class Quiz13 {

	public static void main(String[] args) {
		
		//1. 7~100까지 정수 중에 7의 배수만 가로로 출력.
		
		for(int a = 7; a <= 100; a++) {
			if(a % 7 == 0) {
				System.out.print(a + " ");
			}
		}
		System.out.println(); //줄바꿈
		
		
		for(int i = 7; i<= 100; i+=7) {
			System.out.print(i + " ");
		}
		System.out.println(); //줄바꿈
		
		
		// 2.1~200까지 정수 중에 9의 배수의 개수를 출력.
		
		int count = 0;
		for(int a = 1; a <= 200; a++) {
			if(a % 9 ==0) {
				count++;
			}
		}
		System.out.println("9의 배수의 개수:" + count);
		
		
		
		//3. 50~100사이의 두 수 사이의 합
		
		int sum = 0;
		for(int a =50; a <= 100; a++) {
			sum += a;
		}
		System.out.println("50~100까지 합:" + sum);
		
		
		
		//4. A~Z까지의 가로로 붙여서 출력, A=65, Z=90
		
		String str = "";
		for(char a = 'A'; a <= 'Z'; a++) {
			//System.out.print(a + " ");
			str += a;
		}
		System.out.println(str);

		
		
		//5. 입력받은 정수까지 팩토리얼 5팩토리얼 = 5 * 4 * 3 * 2 * 1
		
		Scanner scan = new Scanner(System.in);
		System.out.print("정수>");
		int num = scan.nextInt();
		
		int sum2 =1;
		for(int a = 1; a <= num; a++) {
			sum2 *= a; 
		}
		
		System.out.println(sum2);
		scan.close();
	}
}
