package org.java.my;

public class MainString {
	
	public static void main(String[] args) {
		if(args.length !=2) {
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0); //���α׷� ���� ����
		}
		
		//args �迭���� ������ ���
		String strNum1 = args[0]; 
		String strNum2 = args[1];
		
		//string �����͸� int�� ��ȯ
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + "+" + num2 + "=" + result);
	}
}
