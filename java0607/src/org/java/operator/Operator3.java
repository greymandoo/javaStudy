package org.java.operator;

public class Operator3 {
	public static void main(String[] args) {
		System.out.println("��������");

		String userId = "m1111";
		String userPw = "1111";

		System.out.println("&& ��� ������ true�� �� true");
		System.out.println(userId == "m1111" && userPw == "1111");
		System.out.println(userId == "m1111" && userPw == "1112");
		System.out.println(userId == "m1112" && userPw == "1111");
		System.out.println(userId == "m1112" && userPw == "1112");

		System.out.println("|| �ϳ��� true�� true");
		System.out.println(userId == "m1111" || userPw == "1111");
		System.out.println(userId == "m1111" || userPw == "1112");
		System.out.println(userId == "m1112" || userPw == "1111");
		System.out.println(userId == "m1112" || userPw == "1112");

	}
}
