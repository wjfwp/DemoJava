package quiz05;

public class Calculator {

	int result;
	double pi = 3.14;
	
	void add(int a) {
		result += a;
	}
	
	void sub(int a) {
		result -= a;
	}
	
	double circle(int a) {
		return pi * a * a;
	}
	
	
}
