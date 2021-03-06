package org.java.condition;

import java.util.Scanner;

public class Switch7 {
	
	public static void main(String[] args) {
		
		System.out.println("switch문");
		
		Scanner scn = new Scanner(System.in);
		
		//Create, Read, Update, Delete(CRUD)
		System.out.println("쿼리문을 입력하세요.(insert, update, select, delete)");
		String input = scn.next(); //문자열 "", char ''
		
		switch(input) {
		case "insert":
			System.out.println("회원가입 페이지로 이동합니다");
			break;
		case "update" : 
			System.out.println("회원수정 페이지로 이동합니다");
			break;
		case "select" :
			System.out.println("회원조회 페이지로 이동합니다");
			break;
		case "delete" :
			System.out.println("회원탈퇴 페이지로 이동합니다");
			break;
		default:
			System.out.println("쿼리문 입력 오류");
		}
		
		scn.close();
	}

}

