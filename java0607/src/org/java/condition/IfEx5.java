package org.java.condition;

import java.util.Scanner;

public class IfEx5 {

	public static void main(String[] args) {

		System.out.println("if-������ �������� ��");

		//scanner �̿�, ���� grade ������ �Է�
		
		int grade=0;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		grade = scn.nextInt();
		
		if (grade >=90) {
			System.out.println("A��� �Դϴ�");
		} else if (grade >=80) {
			System.out.println("B��� �Դϴ�");
		} else if (grade >=70) {
			System.out.println("C��� �Դϴ�");
		} else if (grade >=60) {
			System.out.println("D��� �Դϴ�");
		} else {
			System.out.println("F��� �Դϴ�");
		}
		
		try {
			grade = scn.nextInt();
			
			if (grade >=90) {
				System.out.println("A��� �Դϴ�");
			} else if (grade >=80) {
				System.out.println("B��� �Դϴ�");
			} else if (grade >=70) {
				System.out.println("C��� �Դϴ�");
			} else if (grade >=60) {
				System.out.println("D��� �Դϴ�");
			} else {
				System.out.println("F��� �Դϴ�");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("���� ó��");
		
		
		
		scn.close();
		
	}

}
