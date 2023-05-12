package day10.static_.basic;

public class MainClass {

	public static void main(String[] args) {
		
		String[] arrS = {"가","나","다"};
		System.out.println( MyArrays.printArray(arrS) );
		
		int[] arrI = {1,2,3,4,5};
		System.out.println(MyArrays.printArray(arrI));
		
		char[] arrC = {'a','b','c'};
		System.out.println(MyArrays.printArray(arrC));
		
		System.out.println( MyArrays.printArray(new int[3]) );
		
		//클래스가 여러번 로드 되더라도 static은 단 1번만 실행됨
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
		System.out.println( Init.price );
		
		
		
	}
}
