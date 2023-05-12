package quiz01;

import java.util.Arrays;

public class Quiz21 {

	public static void main(String[] args) {
		
		/*
		 * 1. 1~9까지 숫자 중 절대 중복되지 않는 숫자 3개를 추출
		 *    arr를 랜덤하게 10번 섞어줍니다.
		 *    0~2번쨰 값을 새로운 배열로 옮겨 담아보세요. 
		 */
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		
		int i = 1;
		while(i <= 10) {
			int x = (int)(Math.random()*9);
			int y = (int)(Math.random()*9);
			
			int temp = 0;
			
			temp = arr[x];
			arr[x] = arr[y];
			arr[y] = temp;
			
			i++;
		}
		
		i = 0;
		
		int[] newArr = new int[3];
		for(int x = 0; x < newArr.length; x++) {
			newArr[x] = arr[i];
			i++;
		}
		
		System.out.println(Arrays.toString(newArr));
		
		int[] arr2 = {arr[0], arr[1], arr[2]};
		System.out.println(Arrays.toString(arr2));
		
	}
}
