package org.java.condition;

import java.util.Scanner;

public class IfEx7 {

	public static void main(String[] args) {

		System.out.println("if�� ����");

		//scanner �̿�, ����, ����, ���� ����, ����, ���, ���
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int kor = scn.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int math = scn.nextInt();
		
		System.out.print("���� ������ �Է��Ͻÿ� -> ");
		int eng = scn.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum/3.0;
		
		System.out.println("����: " + sum);
		System.out.println("���: " + avg);
		
		if (avg >= 90) {
			if (avg>=95) {
				System.out.println("��� : A+");
			} else {
				System.out.println("��� : A");
			}
		} else if (avg >= 80) {
			if (avg>=85) {
				System.out.println("��� : B+");
			} else {
				System.out.println("��� : B");
			}
		} else if (avg >= 70) {
			if (avg>=75) {
				System.out.println("��� : C+");
			} else {
				System.out.println("��� : C");
			}
		} else if (avg >= 60) {
			if (avg>=65) {
				System.out.println("��� : D+");
			} else {
				System.out.println("��� : D");
			}
		} else {
			System.out.println("��� : F");
		}
		
		scn.close();
		
	}

}
