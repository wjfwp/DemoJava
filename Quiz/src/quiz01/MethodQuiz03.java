package quiz01;

import java.util.Arrays;

public class MethodQuiz03 {

	public static void main(String[] args) {
		
		char[] arr = {'a','b','c','d'};
		String result = method6(arr);
		System.out.println(result);
		
		int[] arr2 = {1,2,3,4,5};
		int result2 = method7(arr2);
		System.out.println(result2);
		
		String[] arr3 = method8("가", "나");
		System.out.println(Arrays.toString(arr3));
	}//main
	
	static String method6(char[] a) {
		String str = "";
		for(int i = 0; i < a.length; i++) {
			str += a[i];
		}
		return str;
	}
	
	static int method7(int[] arr) {
		int sum = 0;
//		for(int i = 0; i < a.length; i++) {
//			sum += a[i];
//		}
//		
		for(int a : arr) {
			sum += a;
		}
		
		return sum;
	}
	
	static String[] method8(String a, String b) {
//		String[] arr = new String[2];
//		arr[0] = a;
//		arr[1] = b;
		
		String[] arr = {a, b};
		return arr;
		//return new String[] {a, b};
		
	}
	
	
}
