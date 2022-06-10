package org.java.variable2;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		System.out.println("점수를 입력받아 총점과 평균내기");

		Scanner scn = new Scanner(System.in);

		System.out.print("국어 점수를 입력하시오 -> ");
		int kor = scn.nextInt();

		System.out.print("수학 점수를 입력하시오 -> ");
		int mat = scn.nextInt();

		System.out.print("영어 점수를 입력하시오 -> ");
		int eng = scn.nextInt();

		System.out.println("총점 : " + (kor + mat + eng) + "점");
		System.out.println("평균 : " + (kor + mat + eng) / 3.0 + "점");

		scn.close();
	}

}
