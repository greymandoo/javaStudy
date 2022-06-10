package org.java.condition;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {

		System.out.println("if-조건이 여러개일 때");

		//scanner 이용, 변수 grade 정수값 입력
		
		int grade=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		grade = scn.nextInt();
		
		if (grade >=90) {
			System.out.println("A등급 입니다");
		} else if (grade >=80) {
			System.out.println("B등급 입니다");
		} else if (grade >=70) {
			System.out.println("C등급 입니다");
		} else if (grade >=60) {
			System.out.println("D등급 입니다");
		} else {
			System.out.println("F등급 입니다");
		}
		
		try {
			grade = scn.nextInt();
			
			if (grade >=90) {
				System.out.println("A등급 입니다");
			} else if (grade >=80) {
				System.out.println("B등급 입니다");
			} else if (grade >=70) {
				System.out.println("C등급 입니다");
			} else if (grade >=60) {
				System.out.println("D등급 입니다");
			} else {
				System.out.println("F등급 입니다");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("예외 처리");
		
		
		
		scn.close();
		
	}

}
