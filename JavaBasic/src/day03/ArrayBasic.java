package day03;

import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		// 배열
		
		int[] arr;
		
		//배열의 생성
		arr = new int[5];
		
		//배열의 초기화
		arr[1] = 10;
		arr[2] = 10;
		arr[3] = 10;
		arr[4] = 10;
		arr[0] = 10;
		
		//배혈의 모형을 문자열로 출력
		System.out.println(arr); //주소값 배열의 생성위치
		
		System.out.println(Arrays.toString(arr));
		
		//배열의 값의 변경
		arr[2] = 100;
		System.out.println(Arrays.toString(arr));
		
		//배열의 길이
		System.out.println(arr.length);
		
		//배열을 선언하는 다양한 방법
		//1st
		int[] arr2 = new int[3];
		
		//2nd
		int[] arr3 = new int[] {1,2,3};
		
		//3rd
		int arr4[]= {1,2,3};
		
		//배열은 초기값을 지정하지 않으면 기본값으로 자동포기와
		//int 0는 0,double = 0.0, String은 null
		System.out.println(Arrays.toString(arr2));
		
		
	}
}
