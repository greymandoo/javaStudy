package org.java.condition;

import java.util.Scanner;

public class Switch6 {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);		
		
		System.out.println("ù��° ����(����) �Է�");
		int num1 = scn.nextInt();
		
		System.out.println("�ι�° ����(����) �Է�");
		int num2 = scn.nextInt();
		
		System.out.println("���� ��ȣ�� �Է��ϼ��� (+, -, *, /)");
		char op = scn.next().charAt(0); //�Ʒ��ʿ� �߰� ����
		
		int result = 0; //�ʱ�ȭ
		
		switch(op) {
		case '+':
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :			
			result = num1 / num2;
			break;
		case '%' :
			result = num1 % num2;
			break;
		} //break�� ������ ����� �̵�
		
		System.out.println("������ ��� : " + num1 + " " + op + " " + num2 + " = " + result);
		scn.close();
		
		System.out.println("java2022".charAt(0)); //���ڿ��� 0����
		System.out.println("java2022".charAt(1)); //���ڿ��� 1����
		System.out.println("java2022".charAt(2)); //���ڿ��� 2����
		System.out.println("java2022".charAt(3)); //���ڿ��� 3����
		System.out.println("java2022".charAt(4)); //���ڿ��� 4����
		
	}
	
}
