package org.java.operator;

import java.util.Scanner;

public class ASCIIEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("65~90 또는 95~112 사이의 정수를 입력하시오.");

		int alpa = scn.nextInt();

		if (alpa > 64 && alpa < 91) {
			System.out.println("입력값: " + alpa);
			System.out.println("대문자: " + (char) (alpa));

			int upAlpa = alpa + 32;
			System.out.println(upAlpa);
			System.out.println("소문자: " + (char) (upAlpa));
		} else if (alpa > 94 && alpa < 113) {
			System.out.println("입력값: " + alpa);
			System.out.println("소문자: " + (char) (alpa));

			int downAlpa = alpa - 32;
			System.out.println(downAlpa);
			System.out.println("대문자: " + (char) (downAlpa));
		} else {
			System.out.println("다시 65~90 또는 95~112 사이의 정수를 입력하시오.");
		}

		scn.close();

	}

}
