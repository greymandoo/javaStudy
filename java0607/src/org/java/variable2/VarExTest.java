package org.java.variable2;

import java.util.Scanner;

public class VarExTest {
	public static void main(String[] args) {
		System.out.println("���� ���� ���ϱ�");
		
		final double PI=3.14;
		Scanner scn = new Scanner(System.in);
		
		System.out.println("������(����)�� �Է��Ͻÿ�.");
		int radius=scn.nextInt();
		double area=radius*radius*PI;
		System.out.println("�Էµ� ������: "+radius);
		System.out.println(radius+"*"+radius+"*"+PI+"="+(radius*radius*PI));
		System.out.println("���� ����: "+area);
		
		int area2=(int)(radius*radius*PI);
		System.out.println("���� ����(����): "+area2);
		
		scn.close();
	}
}