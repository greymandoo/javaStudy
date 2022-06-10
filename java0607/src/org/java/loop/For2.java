package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for문");

		// 구구단

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		System.out.println("==========================");

		// 거꾸로 구구단
		for (int i = 9; i > 1; i--) {
			System.out.println(i + "단입니다");
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// scanner 이용 시작단 입력받아 구구단 ~9단까지 출력
		Scanner scn = new Scanner(System.in);

		System.out.println("숫자를 입력하시오");
		for (int i = scn.nextInt(); i < 10; i++) {
			System.out.println(i + "단입니다");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// scanner 이용 시작단, 끝단 입력받기
		System.out.println("시작단 입력");
		int start = scn.nextInt();
		System.out.println("끝단 입력");
		int finish = scn.nextInt();

		if (start>finish) {
			System.out.println("시작단이 끝단보다 작거나 같아야합니다");
		} else {
			for (int i = start; i <= finish; i++) {
				System.out.println(i + "단입니다");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
		

		scn.close();

	}

}
