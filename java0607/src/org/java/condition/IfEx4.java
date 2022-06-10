package org.java.condition;

public class IfEx4 {

	public static void main(String[] args) {

		System.out.println("if-조건이 여러개일 때");

		int grade = 90;
		if (grade >= 90) {
			System.out.println("A");
		} else if (grade >= 80) {
			System.out.println("B");
		} else if (grade >= 70) {
			System.out.println("C");
		} else if (grade >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}

	}

}
