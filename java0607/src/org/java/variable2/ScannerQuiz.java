package org.java.variable2;

import java.util.Scanner;

public class ScannerQuiz {

	public static void main(String[] args) {
		System.out.println("������ �Է¹޾� ������ ��ճ���");

		Scanner scn = new Scanner(System.in);

		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int kor = scn.nextInt();

		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int mat = scn.nextInt();

		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int eng = scn.nextInt();

		System.out.println("���� : " + (kor + mat + eng) + "��");
		System.out.println("��� : " + (kor + mat + eng) / 3.0 + "��");

		scn.close();
	}

}
