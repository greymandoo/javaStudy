package org.java.operator;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("단항 연산자");
		
		int i=10;
		
		//선처리 후증가
		System.out.println(i++); //10
		System.out.println(i); //11
		
		//선증가 후처리
		System.out.println(++i); //12
		System.out.println(i); //12
		
		//선처리 후감소
		System.out.println(i--); //12
		System.out.println(i); //11
		
		//선감소 후처리
		System.out.println(--i); //10
		System.out.println(i); //10
		
		for (int j=0;j<10;j++) {
			System.out.println(j);
		}
		for (int j=0;j<10;++j) {
			System.out.println(j);
		}
		//for문에서는 j++과 ++j의 결과가 같다
		
	}
}
