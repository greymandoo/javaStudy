package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//Create, Read, Update, Delete(CRUD)
		System.out.println("�������� �Է��ϼ���.(insert, update, select, delete)");
		String str = scn.next();
		
		if (str.equals("insert")) {
			System.out.println("ȸ�� ���� �������� �̵��մϴ�");
		} else if (str.equals("update")) {
			System.out.println("ȸ�� ���� �������� �̵��մϴ�");
		} else if (str.equals("select")) {
			System.out.println("ȸ�� ��ȸ �������� �̵��մϴ�");
		} else if (str.equals("delete")) {			
			System.out.println("ȸ�� Ż�� �������� �̵��մϴ�");
		}
		
		scn.close();
	}

}
