package org.java.operator;

public class Operator8 {
	public static void main(String[] args) {
		System.out.println("비트 연산자");

		System.out.println("&");
		System.out.println(10 & 20); //1010 10100
		System.out.println(20 & 30); //10100 11110
		
		System.out.println("|");
		System.out.println(10 | 12); //1010 1100
		System.out.println(20 | 30); //10100 11110
		
		System.out.println("~");
		System.out.println(~10); // 1010

	}
}
