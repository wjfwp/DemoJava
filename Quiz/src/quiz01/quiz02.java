package quiz01;

public class quiz02 {

	public static void main(String[] args) {
		
		//1~100까지의 랜덤한 정수를 생성
		
		int a = (int)(Math.random()*100) + 1;
		System.out.println(a);
		
		//랜덤하게 나온 수가 3의 배수인지, 3의 배수가 아닌지 3항연산식으로 결과 출력.
		
		System.out.println(a % 3 == 0 ? a + "는 3의 배수다" : a + "는 3의 배수가 아니다");
		
	}
}
