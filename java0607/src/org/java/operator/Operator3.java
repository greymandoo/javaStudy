package org.java.operator;

public class Operator3 {
	public static void main(String[] args) {
		System.out.println("논리연산자");

		String userId = "m1111";
		String userPw = "1111";

		System.out.println("&& 모든 조건이 true일 때 true");
		System.out.println(userId == "m1111" && userPw == "1111");
		System.out.println(userId == "m1111" && userPw == "1112");
		System.out.println(userId == "m1112" && userPw == "1111");
		System.out.println(userId == "m1112" && userPw == "1112");

		System.out.println("|| 하나라도 true면 true");
		System.out.println(userId == "m1111" || userPw == "1111");
		System.out.println(userId == "m1111" || userPw == "1112");
		System.out.println(userId == "m1112" || userPw == "1111");
		System.out.println(userId == "m1112" || userPw == "1112");

	}
}
