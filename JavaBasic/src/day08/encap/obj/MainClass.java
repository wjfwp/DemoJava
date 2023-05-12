package day08.encap.obj;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Chef c = new Chef();
		//사용하는 곳(생성하는 곳)
		Hotel h = new Hotel(c);
		
		Chef chef = h.getChef(); //반환유형
		chef.cooking(); //chef안에 들어있는 기능
		
		System.out.println(c == chef); //true
		
		
		
	}
}
