package quiz18;

public class StringQuiz03 {

	public static void main(String[] args) {
		 //회문비교 -> "다시 합창 합시다"
	      /*
	      1. String palindrome(String)함수는 매개변수로 String 값을 받아, 회문 여부를 검사하는 static 메서드입니다.
	      2. 회문: 똑바로 읽으나 거꾸로 읽으나 똑같은 단어나 문장.
	      3. ex) 다시 합창 합시다, 다 같은 것은 같다, 아 좋다 좋아 등
	      
	      4. 문장은 공백을 포함하여 받을 수 있습니다.
	      5. 회문이라면 "회문입니다", 아니라면 "회문이 아닙니다" 를 리턴합니다.
	         조건
	         빌더의 reverse() 는 금지 입니다.
	      
	      6. 힌트)
	      * 공백은 없어져야 비교가 됩니다. 
	      * 회문은 첫글자와, 마지막글자 가 똑같습니다.
	      * 
	      */
		
		System.out.println(palindrome("아 좋다 좋아"));
		System.out.println(palindrome("다시다"));
		System.out.println(palindrome("이건 아니지"));
		System.out.println(palindrome("다시 합창 합시다"));
		
	}
	
	//내가 한 거
//	public static String palindrome(String str) {
//				
//		String str1 = str.replace(" ", "");
//		String str2 ="";
//			
//		for(int i = str1.length() - 1; i >= 0; i-- ) {
//			str2 += str1.charAt(i);
//		}
//		
//		if(str1.equals(str2)) {
//			return "회문입니다";
//		}
//		
//		return "회문이 아닙니다";
//	}
	
	
	
	//teacher
//	public static String palindrome(String word) {
//		word = word.replace(" ", "");
//		for(int i = 0; i < word.length() / 2; i++) {
//			char a = word.charAt(i); //시작
//			char b = word.charAt(word.length() -i -1); //끝
//			
//			if(a != b) {
//				return "회문이 아님";
//			}
//		}
//		
//		
//		return "회문"; //"회문이 아님";
//	}
	

	//reverse 사용시
	public static String palindrome(String word) {
		word = word.replace(" ", "");
		StringBuilder sb = new StringBuilder(word);
		return sb.reverse().toString().equals(word) ? "회문" : "회문이 아님";
	}
	
	
	
	
}
