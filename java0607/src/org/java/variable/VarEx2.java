package org.java.variable;

public class VarEx2 {

	public static void main(String[] args) {
		System.out.println("����, ������ Ÿ��");
		System.out.println("primitive type");
		// 1byte = 8bit	-128 ~ +127
		
		//������ ������
		byte b = 10; //1byte�� ������ �� �ִ� ���� b�� ����, 10���� �ʱ�ȭ
		short s = 10; //2byte�� ������ �� �ִ� ���� s�� ����, 10���� �ʱ�ȭ
		int i = 10; //4byte�� ������ �� �ִ� ���� i�� ����, 10���� �ʱ�ȭ
		long l = 10l; //8byte�� ������ �� �ִ� ���� l�� ����, 10���� �ʱ�ȭ

		//�Ǽ��� ������
		float f = 1.1f; //4byte�� ������ �� �ִ� ���� f�� ����, 1.1�� �ʱ�ȭ
		double d = 1.1; //8byte�� ������ �� �ִ� ���� d�� ����, 1.1�� �ʱ�ȭ

		//������ ������
		char ch = 'a'; //2byte�� ������ �� �ִ� ���� ch�� ����, 'a'�� �ʱ�ȭ

		//���� ������
		boolean bool = false; //1byte�� ������ �� �ִ� ���� bool�� ����, false�� �ʱ�ȭ
		
		System.out.println(b);
		System.out.println(s);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(ch);
		System.out.println(bool);
	}
}
