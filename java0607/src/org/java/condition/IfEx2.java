package org.java.condition;

import java.util.Scanner;

public class IfEx2 {

	public static void main(String[] args) {
		
		System.out.println("if��");
		
		//������ true�� ���� ����
		System.out.println("������ �ϳ��� ��");
		
		int num1=10;
		
		if(num1>=10) {
			System.out.println("10���� ũ�ų� �����ϴ�");
		}
		if(num1>=10) System.out.println("10���� ũ�ų� �����ϴ�");
		if(num1>=10) 
			System.out.println("10���� ũ�ų� �����ϴ�");
		
		//Scanner �̿��ؼ� ������ �Է¹޾� 100���� ū�� �Ǻ�
		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է�");
		int key = scn.nextInt();
		if(key>100) System.out.println("100���� ũ��");
		
		//Scanner �̿��ؼ� ���̵� �Է¹޾� "root"�� "��ſ� ���εǼ���"ǥ��
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		if(userId.contentEquals("root")) System.out.println("��ſ� ���εǼ���.");
		
		scn.close();
		
	}
	
}
