package org.java.condition;

import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		
		System.out.println("if��");
		
		//���� �����ڿ� ���
		System.out.println("������ �� ���� ��");
		
		int num1=10;
		int num2=20;
		
		if(num1>10) {
			System.out.println("10���� Ů�ϴ�");
		} else {
			System.out.println("10���� ũ�� �ʴ�");
		}
		
		System.out.println("==================");
		
		if (num1<=10 && num2<=20) {
			System.out.println("������ �����մϴ�");
		} else {
			System.out.println("������ �������� ���߽��ϴ�");
		}
		
		//scanner �̿� ���̵�, ���~~~
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		System.out.println("��й�ȣ �Է�");
		String userPw = scn.next();
		
		if(userId.equals("root") && userPw.equals("1111")) {
			System.out.println("��ſ� ���εǼ���");
		} else {
			System.out.println("ȸ���� �ƴϽñ���");
		}
		
		System.out.println("================");
		
		if (!userId.equals("root") || !userPw.equals("1111")) {
			System.out.println("ȸ���� �ƴϽñ���");
		} else {
			System.out.println("��ſ� ���� �Ǽ���");
		}
		
		
		scn.close();
			
	}
	
}

