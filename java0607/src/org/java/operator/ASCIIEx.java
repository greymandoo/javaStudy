package org.java.operator;

public class ASCIIEx {
	public static void main(String[] args) {
		
		System.out.println("ASCII �ڵ�");
		
		System.out.println('A');
		System.out.println((int)'A');

		char ch='A';
		System.out.println(ch);
		System.out.println((int)ch);
		
		//�ҹ��� >> �빮��
		System.out.println('B'-'A'); //int������ ��ȯ�Ǿ� ���
		System.out.println('a'-'A'); //int������ ��ȯ�Ǿ� ���
		System.out.println('b'-32); //b -> B
		System.out.println('b');
		System.out.println((char)('b'-32)); //int -> char
		
		//�빮�� >> �ҹ���
		System.out.println('A');
		System.out.println('A'+32); //int������ ��ȯ�Ǿ� ���
		System.out.println((char)('A'+32)); //int -> char
		
	}
	
}
