package org.java.operator;

import java.util.Scanner;

public class ASCIIEx2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("65~90 �Ǵ� 95~112 ������ ������ �Է��Ͻÿ�.");

		int alpa = scn.nextInt();

		if (alpa > 64 && alpa < 91) {
			System.out.println("�Է°�: " + alpa);
			System.out.println("�빮��: " + (char) (alpa));

			int upAlpa = alpa + 32;
			System.out.println(upAlpa);
			System.out.println("�ҹ���: " + (char) (upAlpa));
		} else if (alpa > 94 && alpa < 113) {
			System.out.println("�Է°�: " + alpa);
			System.out.println("�ҹ���: " + (char) (alpa));

			int downAlpa = alpa - 32;
			System.out.println(downAlpa);
			System.out.println("�빮��: " + (char) (downAlpa));
		} else {
			System.out.println("�ٽ� 65~90 �Ǵ� 95~112 ������ ������ �Է��Ͻÿ�.");
		}

		scn.close();

	}

}
