package org.java.loop;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		System.out.println("While��");

		// ������
		int i = 2;
		while (i < 10) {
			System.out.println(i + "���Դϴ�");
			int j = 1;
			while (j < 10) {
				System.out.println(i + " * " + j + " = " + (i * j));
				j++;
			}
			i++;
		}
		
		
		// ������ (i=2, k=1�� ����)
		int k = 1;
		while (k < 9) {
			k++;
			System.out.println(k + "���Դϴ�");
			int j = 1;
			while (j < 10) {
				System.out.println(k + " * " + j + " = " + (k * j));
				j++;
			}
		}
		
		//scanner �̿��ؼ� �Է´�~9�ܱ��� ���
		Scanner scn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�> ");
		int num = scn.nextInt();
		
		while(num < 10) {
			System.out.println(num + "���Դϴ�");
			int num2=1;
			while (num2<10) {
				System.out.println(num + " * " + num2 + " = " + num*num2);
				num2++;
			}
			num++;
		}
		
		scn.close();
		
		
		
		
		

	}

}
