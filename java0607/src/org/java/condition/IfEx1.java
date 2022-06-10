package org.java.condition;

public class IfEx1 {

	public static void main(String[] args) {

		System.out.println("if문");

		System.out.println("조건이 한 개일 때");

		int num1 = 15;

		if (num1 > 10) {
			System.out.println("10보다 큽니다");
		}
		if (num1 > 10) System.out.println("10보다 큽니다");
		if (num1 > 10)
			System.out.println("10보다 큽니다");

	}

}
