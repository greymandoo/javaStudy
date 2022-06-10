package org.java.operator;

public class Operator11 {
	public static void main(String[] args) {
		System.out.println("삼항 연산자");

		int i = 10;

		System.out.println(i > 10 ? true : false);

		String e = i > 10 ? "10보다 큽니다" : "10보다 작습니다";
		boolean a = i > 10 ? true : false;
		int b = i > 10 ? 1 : 0;
		double c = i > 10 ? 1.1 : 0.1;
		char d = i > 10 ? 'a' : 'b';

		System.out.println(e);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}
}
