package org.java.variable2;

public class TypeCasting {
	public static void main(String[] args) {
		
		System.out.println("����ȯ");
		//int�� ���� ���� �ڷ����� ����� �ڵ����� int������ ����ȯ
		byte b1=10;
		byte b2=20;
		
		//byte + byte -> int + int
		byte b3=(byte)(b1+b2); //���� ����ȯ
		int i=b1+b2;
		System.out.println(i);
		//ū �ڷ��� + ���� �ڷ��� -> ū �ڷ������� �ڵ� ����ȯ
		
		int i2=10;
		double d=1.1;
		
		int i22=(int)(i2+d);
		//int i3=i2+d //double+double
		double d2=i2+d;
		System.out.println(d2);
		
		int i3=i2+(int)d; //data loss
		int i4=(int)(i2+d); //data loss
		System.out.println(i3);
		System.out.println(i4);
		
		float f1=1.2f;
		float f2=2.0f;
		
		float f3=f1+f2; //float+float = float
		
		float f4=(float)(1.2+2.0); //1.2, 2.0�� ���� double�̶� ���� ����ȯ
		
	}
}
