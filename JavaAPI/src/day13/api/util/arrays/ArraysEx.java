package day13.api.util.arrays;

import java.util.Arrays;

public class ArraysEx {

	public static void main(String[] args) {
		
		int[] arr = {3,1,2,5,6,7 };
		
		//정렬 
		Arrays.sort(arr);
		
		//배열을 문자열로
		System.out.println(Arrays.toString(arr));
		
		//탐색 - 선행조건: 정렬 
		int result = Arrays.binarySearch(arr, 4); //배열명, 찾을값
		System.out.println(result); //음수가 나오면 값은 없음
		
		int result2 = Arrays.binarySearch(arr, 5);
		System.out.println(result2); //값에 대한 위치 반환
		
		//배열복사
		int[] newArr = Arrays.copyOf(arr, arr.length); //복사할배열, 새로운 배열의 길이
		
		System.out.println(Arrays.toString(newArr));
		System.out.println(arr == newArr); //깊은복사(완전히 새로운)
		
		int[] newArr2 = Arrays.copyOf(arr, arr.length * 2);
		System.out.println(Arrays.toString(newArr2) );
		
		//배열크기지정복사
		int[] newArr3 = Arrays.copyOfRange(newArr, 1, 3); //이상~미만
		System.out.println(Arrays.toString(newArr3) );
		
		//배열의 원소비교
		if(Arrays.equals(newArr, arr) ) {
			System.out.println("배열의 원소가 정확히 일치함");
		}
		
		
		
	}
}
