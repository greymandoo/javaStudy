package org.java.operator;

public class Operator10 {
	public static void main(String[] args) {
		System.out.println("���� ������");
		
		int i=10;
		
		//��ó�� ������
		System.out.println(i++); //10
		System.out.println(i); //11
		
		//������ ��ó��
		System.out.println(++i); //12
		System.out.println(i); //12
		
		//��ó�� �İ���
		System.out.println(i--); //12
		System.out.println(i); //11
		
		//������ ��ó��
		System.out.println(--i); //10
		System.out.println(i); //10
		
		for (int j=0;j<10;j++) {
			System.out.println(j);
		}
		for (int j=0;j<10;++j) {
			System.out.println(j);
		}
		//for�������� j++�� ++j�� ����� ����
		
	}
}
