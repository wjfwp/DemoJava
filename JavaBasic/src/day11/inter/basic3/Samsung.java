package day11.inter.basic3;

public class Samsung implements Printed {

	@Override
	public void print(String document) {
		System.out.println("samsung:" + document);
		
	}

	@Override
	public void colorprint(String document, String color) {
		System.out.println("samsung:" + color + ", " + document);
	}

	@Override
	public int copy(int n) {
		System.out.println("samsung:" + n + "장 복사");
		return n;
	}

	
	
}
