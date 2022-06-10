package org.java.operator;

public class ASCIIEx {
	public static void main(String[] args) {
		
		System.out.println("ASCII 코드");
		
		System.out.println('A');
		System.out.println((int)'A');

		char ch='A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		//소문자 >> 대문자
		System.out.println('B'-'A'); //int형으로 변환되어 계산
		System.out.println('a'-'A'); //int형으로 변환되어 계산
		System.out.println('b'-32); //b -> B
		System.out.println('b');
		System.out.println((char)('b'-32)); //int -> char
		
		//대문자 >> 소문자
		System.out.println('A');
		System.out.println('A'+32); //int형으로 변환되어 계산
		System.out.println((char)('A'+32)); //int -> char
		
	}
	
}
