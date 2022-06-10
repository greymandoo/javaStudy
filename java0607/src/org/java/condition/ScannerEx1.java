package org.java.condition;

import java.util.Scanner;

public class ScannerEx1 {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//Create, Read, Update, Delete(CRUD)
		System.out.println("쿼리문을 입력하세요.(insert, update, select, delete)");
		String str = scn.next();
		
		if (str.equals("insert")) {
			System.out.println("회원 가입 페이지로 이동합니다");
		} else if (str.equals("update")) {
			System.out.println("회원 수정 페이지로 이동합니다");
		} else if (str.equals("select")) {
			System.out.println("회원 조회 페이지로 이동합니다");
		} else if (str.equals("delete")) {			
			System.out.println("회원 탈퇴 페이지로 이동합니다");
		}
		
		scn.close();
	}

}
