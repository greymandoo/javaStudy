package org.java.condition;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		System.out.println("if문");
		
		//조건이 true일 때만 실행
		System.out.println("조건이 하나일 때");
		
		int num1=10;
		
		if(num1>=10) {
			System.out.println("10보다 크거나 같습니다");
		}
		if(num1>=10) System.out.println("10보다 크거나 같습니다");
		if(num1>=10) 
			System.out.println("10보다 크거나 같습니다");
		
		//Scanner 이용해서 정수를 입력받아 100보다 큰지 판별
		Scanner scn = new Scanner(System.in);
		System.out.println("정수 입력");
		int key = scn.nextInt();
		if(key>100) System.out.println("100보다 크다");
		
		//Scanner 이용해서 아이디를 입력받아 "root"면 "즐거운 쇼핑되세요"표시
		System.out.println("아이디 입력");
		String userId = scn.next();
		if(userId.contentEquals("root")) System.out.println("즐거운 쇼핑되세요.");
		
		scn.close();
		
	}
	
}
