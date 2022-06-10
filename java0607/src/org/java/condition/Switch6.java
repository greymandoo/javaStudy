package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);		
		
		System.out.println("첫번째 숫자(정수) 입력");
		int num1 = scn.nextInt();
		
		System.out.println("두번째 숫자(정수) 입력");
		int num2 = scn.nextInt();
		
		System.out.println("연산 기호를 입력하세요 (+, -, *, /)");
		char op = scn.next().charAt(0); //아래쪽에 추가 설명
		
		int result = 0; //초기화
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :			
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
		} //break문 나오면 여기로 이동
		
		System.out.println("연산의 결과 : " + num1 + " " + op + " " + num2 + " = " + result);
		scn.close();
		
		System.out.println("java2022".charAt(0)); //문자열의 0번지
		System.out.println("java2022".charAt(1)); //문자열의 1번지
		System.out.println("java2022".charAt(2)); //문자열의 2번지
		System.out.println("java2022".charAt(3)); //문자열의 3번지
		System.out.println("java2022".charAt(4)); //문자열의 4번지
		
	}
	
}
