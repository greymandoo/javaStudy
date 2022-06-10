package org.java.condition;

import java.util.Scanner;

public class IfEx7 {

	public static void main(String[] args) {

		System.out.println("if문 예제");

		//scanner 이용, 국어, 영어, 수학 점수, 총점, 평균, 등급
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하시오 -> ");
		int kor = scn.nextInt();
		
		System.out.print("수학 점수를 입력하시오 -> ");
		int math = scn.nextInt();
		
		System.out.print("영어 점수를 입력하시오 -> ");
		int eng = scn.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
		
		if (avg >= 90) {
			if (avg>=95) {
				System.out.println("등급 : A+");
			} else {
				System.out.println("등급 : A");
			}
		} else if (avg >= 80) {
			if (avg>=85) {
				System.out.println("등급 : B+");
			} else {
				System.out.println("등급 : B");
			}
		} else if (avg >= 70) {
			if (avg>=75) {
				System.out.println("등급 : C+");
			} else {
				System.out.println("등급 : C");
			}
		} else if (avg >= 60) {
			if (avg>=65) {
				System.out.println("등급 : D+");
			} else {
				System.out.println("등급 : D");
			}
		} else {
			System.out.println("등급 : F");
		}
		
		scn.close();
		
	}

}
