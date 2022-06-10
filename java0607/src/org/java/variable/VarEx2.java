package org.java.variable;

public class VarEx2 {

	public static void main(String[] args) {
		System.out.println("변수, 데이터 타입");
		System.out.println("primitive type");
		// 1byte = 8bit	-128 ~ +127
		
		//정수형 데이터
		byte b = 10; //1byte를 저장할 수 있는 변수 b를 선언, 10으로 초기화
		short s = 10; //2byte를 저장할 수 있는 변수 s를 선언, 10으로 초기화
		int i = 10; //4byte를 저장할 수 있는 변수 i를 선언, 10으로 초기화
		long l = 10l; //8byte를 저장할 수 있는 변수 l을 선언, 10으로 초기화

		//실수형 데이터
		float f = 1.1f; //4byte를 저장할 수 있는 변수 f를 선언, 1.1로 초기화
		double d = 1.1; //8byte를 저장할 수 있는 변수 d를 선언, 1.1로 초기화

		//문자형 데이터
		char ch = 'a'; //2byte를 저장할 수 있는 변수 ch를 선언, 'a'로 초기화

		//논리형 데이터
		boolean bool = false; //1byte를 저장할 수 있는 변수 bool을 선언, false로 초기화
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}
}
