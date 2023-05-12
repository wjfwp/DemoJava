package day01;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
		
		//1. 배열의 선언
		int[] arr;
		
		//2. 배열의 생성 - 생성할 당시에 크기를 지정함
		arr = new int[5];
		
		//3. 배열의 초기화 - index를 사용하여 값을 지정
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		arr[4] = 500;
		
		//4. 배열의 사용
		System.out.println("배열의 3번째 값:" + arr[2]);
		arr[2] = 30; //값의 변경
		System.out.println("배열의 3번째 값:" + arr[2]);
		
		//5. 배열의 모형을 문자열로 확인
		System.out.println(arr); //주소값 - 배열의 위치가 나옵니다
		
		System.out.println(Arrays.toString(arr));
		
		
		//6. 배열의 길이
		System.out.println("배열의길이:" + arr.length);
		
		//7. 배열의 선언과 생성을 동시에 하는 방법
		byte[] arr2 = new byte[10];
		
		//8. 배열의 선언과 생성, 초기화 동시에 하는 방법
		int[] arr3 = new int[] {1,2,3,4,5,6,7};
		System.out.println("arr3은:" + Arrays.toString(arr3));
		
		int[] arr4 = {1,2,3,4,5,6};
		System.out.println("arr4는:" + Arrays.toString(arr4));
		
		//9. 배열은 초기값 지정을 하지 않으면 기본값으로 초기화
		//int = 0, double = 0.0, String = null
		System.out.println(Arrays.toString(arr2));
		
		
		//실습 - 월, 화, 수, 목, 금, 토, 일 을 저장하는 문자열 배열
		//3번째 인덱스를 목요일로 변경
		
		String[] day = {"월", "화", "수", "목", "금", "토", "일"};
		System.out.println(Arrays.toString(day));
		day[3] = "목요일";
		System.out.println(day[3]);
		System.out.println(Arrays.toString(day));
	
		
	}
	
}
