package org.java.condition;

import java.util.Scanner;

public class IfEx6 {

	public static void main(String[] args) {

		System.out.println("다중 if문");

		//scanner 이용, 변수 grade 정수값 입력
		
		int grade=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요.");
		grade = scn.nextInt();
		
		if (grade >=90) {
			if (grade >=95) {
				System.out.println("A+등급 입니다");
			} else {
				System.out.println("A등급 입니다");
			}
		} else if (grade >=80) {
			if (grade >=85) {
				System.out.println("B+등급 입니다");
			} else {
				System.out.println("B등급 입니다");
			}
		} else if (grade >=70) {
			if (grade >=75) {
				System.out.println("C+등급 입니다");
			} else {
				System.out.println("C등급 입니다");
			}
		} else if (grade >=60) {
			if (grade >=65) {
				System.out.println("D+등급 입니다");
			} else {
				System.out.println("D등급 입니다");
			}
		} else {
			System.out.println("F등급 입니다");
		}
		
		scn.close();
		
	}

}
