package quiz15;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
		
		IBag b = new MyBag();
		b.insert("a");
		b.insert("b");
		b.insert("c");
		b.insert("d");
		b.insert("e");
		b.insert("f");
		
		
		b.print();
		System.out.println("인덱스 위치 :" +  b.search("d") );
		
		
		System.out.println(b.delete("p"));
		System.out.println(b.delete("d"));
		
		
	}
}
