package org.java.loop;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		System.out.println("for��");

		// ������

		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���Դϴ�");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}
		System.out.println("==========================");

		// �Ųٷ� ������
		for (int i = 9; i > 1; i--) {
			System.out.println(i + "���Դϴ�");
			for (int j = 9; j > 0; j--) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// scanner �̿� ���۴� �Է¹޾� ������ ~9�ܱ��� ���
		Scanner scn = new Scanner(System.in);

		System.out.println("���ڸ� �Է��Ͻÿ�");
		for (int i = scn.nextInt(); i < 10; i++) {
			System.out.println(i + "���Դϴ�");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + i * j);
			}
			System.out.println();
		}

		// scanner �̿� ���۴�, ���� �Է¹ޱ�
		System.out.println("���۴� �Է�");
		int start = scn.nextInt();
		System.out.println("���� �Է�");
		int finish = scn.nextInt();

		if (start>finish) {
			System.out.println("���۴��� ���ܺ��� �۰ų� ���ƾ��մϴ�");
		} else {
			for (int i = start; i <= finish; i++) {
				System.out.println(i + "���Դϴ�");
				for (int j = 1; j < 10; j++) {
					System.out.println(i + " * " + j + " = " + i * j);
				}
				System.out.println();
			}
		}
		

		scn.close();

	}

}
