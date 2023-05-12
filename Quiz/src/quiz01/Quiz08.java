package quiz01;

public class Quiz08 {

	public static void main(String[] args) {
		
		String[] arr= {"안녕", "hello", "니하오", "오하요", "#$^%"};
		
		/*
		 * 1. 랜덤수를 생성하고, 이 랜덤수를 이용해여 배열의 랜덤한 값이 출력되게 처리합니다.
		 * 2. 출력된 문자열이 어느 나라 언어인지 판별해서 출력해주면 됩니다.
		 */
		
		int a =(int)(Math.random()*arr.length);
		System.out.println("선택된 단어:" + arr[a]);
		
		switch (arr[a]) {
		case "안녕":
			System.out.println("한국어입니다");
			break;
		case "hello":
			System.out.println("영어입니다");
			break;
		case "니하오":
			System.out.println("중국어입니다");
			break;
		case "오하요":
			System.out.println("일본어입니다");
			break;

		default:
			System.out.println("알 수 없는 언어입니다");
			break;
		}
		
	}
}
