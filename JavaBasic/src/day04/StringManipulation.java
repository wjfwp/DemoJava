package day04;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {
		
		//문자열다루기
		//문자열은 사실 배열립니다. 문자열은 인덱스가 있습니다.
		
		String str = "안녕하세요~ 영어로하면 하이!";
		//System.out.println( str[0] ); //안돼!
		
		//문자열을 다루는 다양한 메서드를 제공
		
		//문자열을 한글자 자르기
		char c = str.charAt(1);
		System.out.println(c);
		
		//문자열의 위치확인 indexOf, lastIndexOf - 없다면 -1을 반환
		int idx = str.indexOf("야");
		System.out.println("문자의 위치:" + idx); 
		
		int idx2 = str.lastIndexOf("하");
		System.out.println("뒤에서부터 찾은 위치:" + idx2);
		
		//문자열 변환 toUpperCase, toLowerCase
		String s = "abcDEF";
		
		String result = s.toUpperCase();
		System.out.println(result); //대문자로
		System.out.println(s); //❤원본문자열은 그대로💕
		
		String result2 = s.toLowerCase();
		System.out.println(result2); //소문자로
		
		System.out.println("=========================================");
		//문자열 변경 replace
		s = "abcdefaaa";
		
		String result3 = s.replace("a", "x");
		System.out.println(result3); //a -> x로 변경, (전부다)
		System.out.println(s); //❤원본문자열은 그대로💕
		
		String result4 = s.replaceFirst("a", "x");
		System.out.println(result4); //a -> x로 변경, (첫번째만)
		
		System.out.println("=========================================");
		
		//공백제거 trim
		str = "   0101-1111-2222   ";
		String result5 = str.trim(); //앞뒤 공백을 제거해서 반환
		System.out.println(result5);
		
		str = "   안녕 하세요?  오늘은 4월 19일 입니다    ";
		System.out.println( str.trim() ); //원본문자열 그대로 유지, trim은 앞뒤 공백만 없애줌
		str = str.replace(" ",""); //공백을 전부 제거해서 원본문자열에 저장
		System.out.println(str);
		
		System.out.println("========================================");
		//문자열 자르기 
		//특정 위치에서 자르기 substring - 인덱스 기준으로 자름
		str = "010-1111-2222";
		String result6 = str.substring(9); //인덱스 번째 미만 절삭
		System.out.println(result6);
		
		//str은 변함 없음
		String result7 = str.substring(4,8); // 4 <= x < 8 인덱스 추출
		System.out.println(result7);
		
		System.out.println(str); //원본은 변함없음
		
		//split - 특정 문자를 기준으로 자름 (제대로 사용하려면 정규표현식)
		String[] arr = str.split("-");
		System.out.println( Arrays.toString(arr) );
		
		String[] arr2 = str.split(""); //String형 배열
		System.out.println(Arrays.toString(arr2)); 
		
		//toCharArray - 한글자씩 char형으로 자름
		char[] arr3 = str.toCharArray(); //char형 배열
		System.out.println( Arrays.toString(arr3) ); 
		
		System.out.println("========================================");
		//문자열의 길이
		str = "안녕하세요";
		int len = str.length();
		System.out.println("문자열길이:" + len);
		
		//문자열의 비교 equals()
		if(str.equals("안녕하세요") ) {
			System.out.println("두 문자가 같음");
		}
		
		//문자열의 포함여부 contains()
		if(str.contains("녕") ) {
			System.out.println("녕이 포함되어 있음");
		}
		
		char z = 'a';
		String u = z == 0 ? "짝수" : "홀수";
		
		System.out.println(u);

		
	}
}
