package quiz01;

import java.util.Scanner;

public class Quiz20 {

	public static void main(String[] args) {
	
		//백준 - 1차원배열 - 10818번
		
		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		int[] arr = new int [n];
//		int max = -1000000;
//		int min = 1000000;
//		
//		for(int i = 0; i < n; i++) {
//			int c = scan.nextInt();
//			arr[i] = c;
//			
//			if(arr[i] > max) {
//				max = arr[i];
//			} else if(arr[i] < min) {
//				min = arr[i];
//			}
//			
//			
//		}
//		System.out.print(min + " " + max);
//	
		
		int a = scan.nextInt();
		int[] arr = new int[a]; //크기가 a인 배열
		
		int i = 0;
		while(i < arr.length) {
			arr[i] = scan.nextInt();
			i++;
		}
		
		//최소, 최대 결정
		int min = arr[0];
		int max = arr[0];
		
		i = 0;
		while(i < arr.length) {
			
			if(min > arr[i]) {
				min = arr[i];
			}
			
			if(max < arr[i]) {
				max = arr[i];
			}
			
			i++;
		}
		System.out.print(min + " " + max); 
		
		scan.close();
	}
}

